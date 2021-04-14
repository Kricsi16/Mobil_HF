package com.example.anime_list.ui

import android.content.Context
import com.example.anime_list.data.AnimeDao
import com.example.anime_list.interactors.films.FilmsInteractor
import com.example.anime_list.ui.details.DetailsPresenter
import com.example.anime_list.ui.favourite.FavouritePresenter
import com.example.anime_list.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context
    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, animeDao:AnimeDao,filmsInteractor: FilmsInteractor) = MainPresenter(executor,animeDao , filmsInteractor)

    @Provides
    @Singleton
    fun favouritePresenter(executor: Executor) = FavouritePresenter(executor)

    @Provides
    @Singleton
    fun detailsPresenter(executor: Executor) = DetailsPresenter(executor)

    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)
}