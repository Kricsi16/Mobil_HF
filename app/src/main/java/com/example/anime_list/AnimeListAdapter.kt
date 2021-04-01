package com.example.anime_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimeListAdapter:RecyclerView.Adapter <AnimeListAdapter.AnimeItemHolder>(){
    private val animeList: MutableList<String> = mutableListOf()

    class AnimeItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView=itemView.findViewById(R.id.AnimeTitle)
        var detailsButton:Button=itemView.findViewById(R.id.DetailsButton)
        var favouriteButton:ImageButton=itemView.findViewById(R.id.FavouriteImageButton)
    }

    fun initList(list: List<String>){
        animeList.clear()
        animeList.addAll(list)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.anime_items,parent,false)
        return AnimeItemHolder(itemView)

    }

    override fun getItemCount(): Int {
        return animeList.size

    }

    override fun onBindViewHolder(holder: AnimeItemHolder, position: Int) {
        val item = animeList[position]
        holder.title.text=item

    }

}