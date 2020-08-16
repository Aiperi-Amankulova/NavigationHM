package com.example.navigationhm.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun dataSave(data: Data )

    @Query("SELECT * FROM Data")
    fun getData(): List<Data>

    @Query("SELECT * FROM Data")
    fun getDataList(): LiveData<List<Data>>
}