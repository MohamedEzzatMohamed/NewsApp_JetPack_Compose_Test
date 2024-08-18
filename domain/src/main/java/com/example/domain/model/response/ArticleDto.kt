package com.example.domain.model.response

import android.os.Parcelable
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize

@Parcelize
@Serializable
data class ArticleDto(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val sourceDto: SourceDto,
    val title: String,
    val url: String,
    val urlToImage: String
): Parcelable