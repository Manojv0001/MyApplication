package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.data.dao.MovieDao
import com.example.myapplication.data.entity.Movie


@Database(entities = [Movie::class], version = AppDb.VERSION, exportSchema = true)
abstract class AppDb : RoomDatabase() {
    companion object {
        const val VERSION = 1
    }

    abstract fun movieDao(): MovieDao
}