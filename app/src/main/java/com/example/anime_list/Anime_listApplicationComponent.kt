package com.example.anime_list

import com.example.anime_list.interactors.InteractorModul
import com.example.anime_list.network.FilmsApiModul
import com.example.anime_list.ui.UIModule
import com.example.anime_list.ui.main.MainActivity
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, FilmsApiModul::class, InteractorModul::class])
interface Anime_listApplicationComponent {
    fun inject(mainActivity: MainActivity)

}