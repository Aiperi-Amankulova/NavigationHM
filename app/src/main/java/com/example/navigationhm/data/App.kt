package com.example.navigationhm.data

import android.app.Application
import androidx.room.Room
import androidx.room.Room.databaseBuilder as databaseBuilder1

class App: Application() {
    private var database: Data?=null

    override fun onCreate() {
        super.onCreate()
        app = this
        database = Room.databaseBuilder(this, Data::class.java,DB_NAME)
            .allowMainThreadQueries()
            .build()
    }
    fun getDb()=database

    companion object {
        private const val DB_NAME = "DB_NAME"
        var app: App? = null

    }
}