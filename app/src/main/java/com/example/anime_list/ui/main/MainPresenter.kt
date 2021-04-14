package com.example.anime_list.ui.main

import com.example.anime_list.data.AnimeDao
import com.example.anime_list.interactors.films.FilmsInteractor
import com.example.anime_list.interactors.films.event.GetFilmsEvent
import com.example.anime_list.model.AnimeDto
import com.example.anime_list.model.Films
import com.example.anime_list.ui.Presenter
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject

class MainPresenter @Inject constructor(private val executor: Executor, private val animeDao:AnimeDao,private val filmsInteractor: FilmsInteractor) : Presenter<MainScreen>() {

    override fun attachScreen(screen: MainScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun refreshFilms() {
        executor.execute {
            filmsInteractor.getFilms()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: GetFilmsEvent) {
        if (event.throwable != null) {
            event.throwable?.printStackTrace()
            if (screen != null) {
                screen?.showNetworkError(event.throwable?.message.orEmpty())
            }
        } else {
            if (screen != null) {
                if (event.films != null) {
                    val animeList = (event.films as List<Films>).map { AnimeDto(it) }
                    animeDao.insertAnimeList(animeList)
                    screen?.showAnimes(animeList)
                }

            }
        }
    }
}