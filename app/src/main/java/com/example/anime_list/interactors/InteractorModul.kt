package com.example.anime_list.interactors

import com.example.anime_list.interactors.films.FilmsInteractor
import com.example.anime_list.network.FilmsApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
    class InteractorModul {
        @Provides
        @Singleton
        fun provideArtistsInteractor(filmsApi: FilmsApi) = FilmsInteractor(filmsApi)
    }
