package com.example.anime_list.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Anime::class], version = 1, exportSchema = false)
abstract class AnimeListDatabase:RoomDatabase() {
    abstract fun animeDao():AnimeDao

    companion object {
        private var INSTANCE: AnimeListDatabase ?= null

        fun getDatabase(context:Context):AnimeListDatabase{
            val tempInstance=INSTANCE

            if (tempInstance!= null){
                return tempInstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    AnimeListDatabase::class.java,
                    "anime_database"
                ).build()
                INSTANCE=instance
                return instance
            }

        }
    }
}