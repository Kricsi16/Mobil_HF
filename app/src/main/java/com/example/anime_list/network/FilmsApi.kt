package com.example.anime_list.network



import com.example.anime_list.model.Films
import retrofit2.Call
import retrofit2.http.*

interface FilmsApi {
    /**
     * Return all films
     * The Films endpoint returns information about all of the Studio Ghibli films.
     * @return Call<List></List><Films>>
    </Films> */
    @GET("films")
    fun getFilms(): Call<List<Films>?>?
}