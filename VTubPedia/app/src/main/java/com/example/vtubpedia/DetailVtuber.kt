package com.example.vtubpedia

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


@Suppress("DEPRECATION")
class DetailVtuber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_vtuber)

        val vtuber = intent.getParcelableExtra<Vtubpedia>("VTUBER DATA")

            vtuber?.let {
                val imgPhoto = findViewById<ImageView>(R.id.img_item_photo)
                val tvName = findViewById<TextView>(R.id.tv_item_name)
                val tvAgency = findViewById<TextView>(R.id.tv_item_agency)
                val tvDescription = findViewById<TextView>(R.id.tv_item_description)

                Glide.with(this)
                    .load(vtuber.photo)
                    .into(imgPhoto)
                tvName.text = vtuber.name
                tvAgency.text = vtuber.agency
                tvDescription.text = vtuber.description
            }
    }
}