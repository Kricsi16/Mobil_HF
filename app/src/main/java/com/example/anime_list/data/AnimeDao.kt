package com.example.anime_list.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.anime_list.model.AnimeDto

@Dao
interface AnimeDao {

    fun insertAnimeList(animeList:List<AnimeDto>){
        animeList.forEach {
            val entity = Anime(it.title,it.original_title,it.original_title_romanised,it.description,it.director,it.producer,it.score,it.release_date,it.favourite)
            addAnime(entity)
        }

    }
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addAnime(anime:Anime)


    @Query("SELECT * FROM animes_table ORDER BY title")
    fun getAnimes(): LiveData<List<Anime>>


}