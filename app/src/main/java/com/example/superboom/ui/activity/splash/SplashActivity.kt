package com.example.superboom.ui.activity.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.superboom.R
import com.example.superboom.ui.activity.main.MarvelListActivity

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initSplash()
    }

    // Use Handler() to delay the splash screen for 2000 milliseconds(2 seconds).
    private fun initSplash() {
        Handler().postDelayed({
            startActivity(Intent(this, MarvelListActivity::class.java))
            finish()
        }, 2000)
    }
}