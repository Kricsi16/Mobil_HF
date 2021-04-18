package com.example.anime_list
import android.app.Application
import com.example.anime_list.ui.UIModule


class Anime_listApplication : Application() {
    lateinit var injector: Anime_listApplicationComponent

    override fun onCreate() {
        super.onCreate()
        //injector =  DaggerAnime_listApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}