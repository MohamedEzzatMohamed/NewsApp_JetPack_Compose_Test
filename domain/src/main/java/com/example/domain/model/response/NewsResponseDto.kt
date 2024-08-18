package com.example.domain.model.response

import androidx.room.Entity
import kotlinx.serialization.SerialName

@Entity(tableName = "News")
data class NewsResponseDto(

    @SerialName("articles")
    val articleDtos: List<ArticleDto>,

    val status: String,

    val totalResults: Int
)