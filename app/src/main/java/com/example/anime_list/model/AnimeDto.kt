package com.example.anime_list.model

import androidx.room.PrimaryKey

data class AnimeDto constructor(
    val title: String,
    val original_title: String,
    val original_title_romanised: String,
    val description: String,
    val director: String,
    val producer: String,
    val score: Double,
    val release_date: String,
    val favourite: Boolean
) {
    constructor(f: Films) : this(
        f.title,
        f.originalTitle,
        f.originalTitleRomanised,
        f.description,
        f.director,
        f.producer,
        f.rtScore.toDouble(),
        f.releaseDate,
        false
    )
}

