package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.domain.model.response.NewsResponseDto

@TypeConverters(Converter::class)
@Database(entities = [NewsResponseDto::class], version = 3)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsListDao(): NewsListDao

    companion object {
        private var instance: NewsDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): NewsDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    ctx.applicationContext,
                    NewsDatabase::class.java,
                    "news_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return instance!!
        }
    }
}