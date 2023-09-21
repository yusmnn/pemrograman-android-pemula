package com.example.vtubpedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListVtuberAdapter (private val listVtuber: ArrayList<Vtubpedia>) : RecyclerView.Adapter<ListVtuberAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvAgency: TextView = itemView.findViewById(R.id.tv_item_agency)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_vtuber, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listVtuber.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, agency, description, photo) = listVtuber[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvAgency.text = agency
        holder.tvDescription.text = description

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailVtuber::class.java)
            intent.putExtra("VTUBER DATA", listVtuber[position])
            holder.itemView.context.startActivities(arrayOf(intent))
//            holder.itemView.context.startActivities(intent)
        }
    }


}