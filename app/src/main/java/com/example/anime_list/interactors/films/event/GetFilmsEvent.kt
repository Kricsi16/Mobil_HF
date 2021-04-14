package com.example.anime_list.interactors.films.event

import com.example.anime_list.model.Films

data class GetFilmsEvent(
    var code: Int = 0,
    var films: List<Films>? = null,
    var throwable: Throwable? = null
)