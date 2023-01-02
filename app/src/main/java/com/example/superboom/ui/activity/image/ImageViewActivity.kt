package com.example.superboom.ui.activity.image

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.superboom.R
import com.example.superboom.data.MarvelCharacters
import com.example.superboom.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        val actionBar = supportActionBar
        actionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_black)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        initLayout()
    }

    private fun initLayout() {
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val heroDetails = intent.getParcelableExtra<MarvelCharacters>("hero_pic")
        heroDetails?.let {
            val imageUrl = "${
                heroDetails.thumbnail?.path
            }/standard_fantastic.${heroDetails.thumbnail?.extension}"
            Glide.with(this)
                .load(imageUrl)
                .into(binding.imgPhotoView)

        }

        if (heroDetails != null) {
            title = heroDetails.name
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}