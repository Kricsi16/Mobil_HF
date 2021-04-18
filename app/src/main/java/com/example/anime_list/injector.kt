package com.example.anime_list

import android.app.Activity
import androidx.fragment.app.Fragment


val Activity.injector: Anime_listApplicationComponent
    get() {
        return (this.applicationContext as Anime_listApplication).injector
    }

/*val Fragment.injector: Anime_listApplicationComponent
    get() {
        return (this.requireContext().applicationContext as Anime_listApplication).injector
    }*/