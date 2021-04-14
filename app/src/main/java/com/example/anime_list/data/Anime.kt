package com.example.anime_list.data

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(tableName="animes_table",
    indices = [Index(value = ["title"], unique = true)])

data class Anime (
    @PrimaryKey
    val title: String,
    val original_title: String,
    val original_title_romanised: String,
    val description: String,
    val director: String,
    val producer: String,
    val score: Double,
    val release_date: String,
    val favourite: Boolean
)

