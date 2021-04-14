package com.example.anime_list.interactors.films

import android.util.Log
import com.example.anime_list.interactors.films.event.GetFilmsEvent
import com.example.anime_list.network.FilmsApi

import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class FilmsInteractor @Inject constructor(private var filmsApi: FilmsApi) {

    fun getFilms() {

        val event = GetFilmsEvent()

        try {

            val filmsQueryCall = filmsApi.getFilms()

            val response = filmsQueryCall?.execute()
            Log.d("Reponse", response?.body().toString())
            if (response?.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            event.films = response.body()?: emptyList()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }
}