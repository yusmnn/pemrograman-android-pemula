package com.example.vtubpedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvVtuber: RecyclerView
    private val list = ArrayList<Vtubpedia>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvVtuber = findViewById(R.id.rv_vtube)
        rvVtuber.setHasFixedSize(true)

        list.addAll(getListVtuber())
        showRecyclerList()

        val aboutButton: ImageButton = findViewById(R.id.btn_about)
        aboutButton.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

    }

    private fun getListVtuber(): ArrayList<Vtubpedia> {

        val dataName = resources.getStringArray(R.array.data_name)
        val dataAgency = resources.getStringArray(R.array.data_agency)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listVtuber = ArrayList<Vtubpedia>()
        for (i in dataName.indices) {
            val vtuber = Vtubpedia(dataName[i], dataAgency[i], dataDescription[i], dataPhoto[i])
            listVtuber.add(vtuber)
        }
        return listVtuber
    }

    private fun showRecyclerList() {
        rvVtuber.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListVtuberAdapter(list)
        rvVtuber.adapter = listAdapter
    }

}