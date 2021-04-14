package com.example.anime_list.ui.favourite

import com.example.anime_list.model.Films

interface FavouriteScreen {
    fun showArtists(artists: List<Films>?)
    fun showNetworkError(errorMsg: String)
}