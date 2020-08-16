package com.example.navigationhm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Data(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title : String
)