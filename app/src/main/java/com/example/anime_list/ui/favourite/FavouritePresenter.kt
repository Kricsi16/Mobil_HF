package com.example.anime_list.ui.favourite

import com.example.anime_list.ui.Presenter
import org.greenrobot.eventbus.EventBus
import java.util.concurrent.Executor
import javax.inject.Inject

class FavouritePresenter @Inject constructor(private val executor: Executor) : Presenter<FavouriteScreen>() {

    @Inject
    lateinit var favouritePresenter: FavouritePresenter

    override fun attachScreen(screen: FavouriteScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }
}