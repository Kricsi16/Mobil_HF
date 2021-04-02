package com.example.anime_list

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FavouriteListAdapter : RecyclerView.Adapter<FavouriteListAdapter.FavouriteItemHolder>() {

    private val animeList: MutableList<String> = mutableListOf()

    class FavouriteItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.AnimeTitle)
        var detailsButton: Button = itemView.findViewById(R.id.DetailsButton)


        init {
            detailsButton.setOnClickListener {
                val intent = Intent(itemView.context, DeatilsActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    fun initList(list: List<String>) {
        animeList.clear()
        animeList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.favourite_items, parent, false)
        return FavouriteItemHolder(itemView)

    }

    override fun getItemCount(): Int {
        return animeList.size

    }

    override fun onBindViewHolder(holder: FavouriteItemHolder, position: Int) {
        val item = animeList[position]
        holder.title.text = item

    }
}