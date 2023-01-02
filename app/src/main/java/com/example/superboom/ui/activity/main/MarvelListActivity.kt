package com.example.superboom.ui.activity.main

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superboom.R
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.databinding.ActivityMarvelListBinding
import com.example.superboom.ui.activity.details.HeroDetailsActivity
import com.example.superboom.ui.adapter.MarvelRecyclerViewAdapter
import com.example.superboom.viewmodel.list.MarvelListViewModel
import io.reactivex.android.schedulers.AndroidSchedulers

class MarvelListActivity : AppCompatActivity(), MarvelRecyclerViewAdapter.ItemClickListener {
    private val TAG = "MarvelListActivity"
    private lateinit var binding: ActivityMarvelListBinding
    //private val marvelRecyclerViewAdapter: MarvelRecyclerViewAdapter? = null
    private var recyclerState: Parcelable? = null
    //private var viewModel: MarvelListViewModel? = null

    private val viewModel: MarvelListViewModel by lazy {
        ViewModelProviders.of(this).get(MarvelListViewModel::class.java)
    }

    private val marvelRecyclerViewAdapter: MarvelRecyclerViewAdapter by lazy {
        MarvelRecyclerViewAdapter()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel_list)

        initLayout()
        observeList()
    }

    private fun initLayout() {
        binding = ActivityMarvelListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressBar.visibility = View.VISIBLE
        binding.tvLoading.visibility = View.VISIBLE
        binding.recyclerMarvelList.visibility = View.GONE

        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerMarvelList.layoutManager  = linearLayoutManager
        binding.recyclerMarvelList.adapter = marvelRecyclerViewAdapter
        marvelRecyclerViewAdapter.addItemClickListener(this)
    }

    private fun observeList() {
        val disposable = viewModel.characterList
            .observeOn(AndroidSchedulers.mainThread())
            ?.subscribe(
                { list ->
                    marvelRecyclerViewAdapter.submitList(list)
                    binding.progressBar.visibility = View.GONE
                    binding.tvLoading.visibility = View.GONE
                    binding.recyclerMarvelList.visibility = View.VISIBLE
                    if (recyclerState != null) {
                        binding.recyclerMarvelList.layoutManager?.onRestoreInstanceState(recyclerState)
                        recyclerState = null
                    }
                },
                { it ->
                    Log.e(TAG, "Error", it)
                }
            )
    }

    override fun onItemClick(event: MarvelCharacters?) {
        val bundle = bundleOf("hero" to event)
        val intent = Intent(this, HeroDetailsActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)

    }
}