package com.example.anime_list

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class AnimeListAdapter:RecyclerView.Adapter <AnimeListAdapter.AnimeItemHolder>(){
    private val animeList: MutableList<String> = mutableListOf()

    class AnimeItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView=itemView.findViewById(R.id.AnimeTitle)
        var detailsButton:Button=itemView.findViewById(R.id.DetailsButton)
        var favouriteButton:ImageButton=itemView.findViewById(R.id.FavouriteImageButton)

        init {
            detailsButton.setOnClickListener {
                val intent = Intent(itemView.context, DeatilsActivity::class.java)
                intent.putExtra("Title","ALMA")
                intent.putExtra("Original_title","ALMA")
                intent.putExtra("Producer","ALMA")
                intent.putExtra("Director","ALMA")
                intent.putExtra("Score","ALMA")
                intent.putExtra("Description","ALMA")
                intent.putExtra("Release_date","ALMA")
                itemView.context.startActivity(intent)
            }
        }
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