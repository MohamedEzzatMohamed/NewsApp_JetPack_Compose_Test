package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.domain.model.response.NewsResponseDto


@Dao
interface NewsListDao {

    @Insert
    fun insert(newsResponse: NewsResponseDto)

    @Query("Select * from articles")
    fun getNews(): NewsResponseDto
}