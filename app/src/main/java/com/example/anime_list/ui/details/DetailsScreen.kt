package com.example.anime_list.ui.details

import com.example.anime_list.model.Films

interface DetailsScreen {
    fun showArtists(artists: List<Films>?)
    fun showNetworkError(errorMsg: String)
}