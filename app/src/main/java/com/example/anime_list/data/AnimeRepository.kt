package com.example.anime_list.data

import androidx.lifecycle.LiveData

class AnimeRepository(private val animeDao:AnimeDao) {

    val getAnimes: LiveData<List<Anime>> = animeDao.getAnimes()

    suspend fun addAnime(anime:Anime){
        animeDao.addAnime(anime)
    }
}