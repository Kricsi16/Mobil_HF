package com.example.anime_list.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnimeViewModel(application: Application):AndroidViewModel(application) {
    private val getAnimes: LiveData<List<Anime>>
    private val repository:AnimeRepository
    init {
        val animeDao= AnimeListDatabase.getDatabase(application).animeDao()
        repository= AnimeRepository(animeDao)
        getAnimes=repository.getAnimes
    }

    fun addAnime(anime:Anime){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addAnime(anime)
        }
    }
}