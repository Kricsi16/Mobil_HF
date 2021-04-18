package com.example.anime_list.ui.favourite

import com.example.anime_list.model.AnimeDto


interface FavouriteScreen {
    fun showFavourites(animes: List<AnimeDto>)
    fun showNetworkError(errorMsg: String)
}