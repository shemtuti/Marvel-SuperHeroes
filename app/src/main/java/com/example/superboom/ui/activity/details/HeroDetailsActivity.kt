package com.example.superboom.ui.activity.details

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.bumptech.glide.Glide
import com.example.superboom.R
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.databinding.ActivityHeroDetailsBinding
import com.example.superboom.ui.activity.image.ImageViewActivity

class HeroDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeroDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_hero_details)
        val actionBar = supportActionBar
        actionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_black)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        initLayout()
    }

    private fun initLayout() {
        binding = ActivityHeroDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val heroDetails = intent.getParcelableExtra<MarvelCharacters>("hero")
        heroDetails?.let {
            val imageUrl = "${
                heroDetails.thumbnail?.path
            }/portrait_xlarge.${heroDetails.thumbnail?.extension}"
            Glide.with(this)
                .load(imageUrl)
                .into(binding.imgPhotoDetails)


            binding.apply {
                title = heroDetails.name
                tvHeroDetails.text = heroDetails.description.ifEmpty { "No description for hero." }
            }
        }

        binding.imgPhotoDetails.setOnClickListener(View.OnClickListener {
            val bundle = bundleOf("hero_pic" to heroDetails)
            val intent = Intent(this, ImageViewActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}