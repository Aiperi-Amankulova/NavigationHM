package com.example.navigationhm.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Data::class],version = 2)
abstract class database: RoomDatabase() {
    abstract fun getDataModel(): Dao
}