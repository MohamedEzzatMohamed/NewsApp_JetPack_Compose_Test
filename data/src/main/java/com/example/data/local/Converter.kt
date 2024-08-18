package com.example.data.local

import androidx.room.TypeConverter
import com.example.domain.model.response.ArticleDto
import com.example.domain.model.response.SourceDto
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class Converter {
    @TypeConverter
    fun fromNews(news: List<ArticleDto>): String {
        return Json.encodeToString(news)
    }

    @TypeConverter
    fun toNews(string: String): List<ArticleDto> {
        return Json.decodeFromString(string)
    }

    @TypeConverter
    fun fromSource(source: SourceDto): String {
        return Json.encodeToString(source)
    }

    @TypeConverter
    fun toSource(string: String): SourceDto {
        return Json.decodeFromString(string)
    }
}