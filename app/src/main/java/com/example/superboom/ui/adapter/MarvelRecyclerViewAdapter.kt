package com.example.superboom.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.superboom.R
import com.example.superboom.data.MarvelCharacters

class MarvelRecyclerViewAdapter : PagedListAdapter<MarvelCharacters, MarvelRecyclerViewAdapter.MarvelListViewHolder>(
    characterDiff
) {
    //Item click
    private var mItemClickListener: ItemClickListener? = null

    fun addItemClickListener(listener: ItemClickListener) {
        mItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return MarvelListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarvelListViewHolder, position: Int) {
        val character = getItem(position)
        holder.tvName.text = character?.name
        holder.tvDescription.text = character?.description

        holder.imgThumbnail.apply {
            val imageUrl = "${character?.thumbnail?.path}/portrait_medium.${character?.thumbnail?.extension}"

            Glide.with(holder.imgThumbnail)
                .load(imageUrl)
                .apply(
                    RequestOptions()
                        .placeholder(R.drawable.loading_animation)
                        .error(R.drawable.ic_broken_image)
                        .circleCrop()
            ).into(holder.imgThumbnail)
        }

        holder.imgThumbnail.setOnClickListener(View.OnClickListener {
            clickListener(character)
        })

        holder.lnHero.setOnClickListener(View.OnClickListener {
            clickListener(character)
        })

    }

    private fun clickListener(character: MarvelCharacters?) {
        if (mItemClickListener != null) {
            mItemClickListener!!.onItemClick(character)
        }
    }

    class MarvelListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgThumbnail = itemView.findViewById<ImageView>(R.id.imgCharacterThumbnail)
        val tvName = itemView.findViewById<TextView>(R.id.tvCharacterName)
        val tvDescription = itemView.findViewById<TextView>(R.id.tvCharacterDescription)
        val lnHero = itemView.findViewById<LinearLayout>(R.id.lnHero)
    }

    companion object {
        val characterDiff = object : DiffUtil.ItemCallback<MarvelCharacters>() {
            override fun areItemsTheSame(old: MarvelCharacters, new: MarvelCharacters): Boolean {
                return old.id == new.id
            }

            override fun areContentsTheSame(old: MarvelCharacters, new: MarvelCharacters): Boolean {
                return old == new
            }
        }
    }

    //Define your Interface method here
    interface ItemClickListener {
        fun onItemClick(event: MarvelCharacters?)
    }
}