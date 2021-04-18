package com.example.anime_list.ui.details

import com.example.anime_list.model.AnimeDto
import com.example.anime_list.model.Films

interface DetailsScreen {
    fun showDetails(details:List<AnimeDto>)
    fun showNetworkError(errorMsg: String)
}