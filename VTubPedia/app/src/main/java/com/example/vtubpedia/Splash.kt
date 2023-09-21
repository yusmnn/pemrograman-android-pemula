package com.example.vtubpedia

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class Splash : AppCompatActivity() {
    private val splashDelay = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(
                this@Splash,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }, splashDelay)
    }
}