package com.example.anime_list.ui.main

import com.example.anime_list.model.AnimeDto
import com.example.anime_list.model.Films

interface MainScreen {
    fun showAnimes(animes: List<AnimeDto>)
    fun showNetworkError(errorMsg: String)
}