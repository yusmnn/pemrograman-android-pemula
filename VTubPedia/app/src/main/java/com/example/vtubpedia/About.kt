package com.example.vtubpedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val profileImageView = findViewById<CircleImageView>(R.id.profileImageView)
        val imageUrl = "https://i.postimg.cc/VvcXBwGy/img-profile.jpg"
        Picasso.get().load(imageUrl).into(profileImageView)
    }

}