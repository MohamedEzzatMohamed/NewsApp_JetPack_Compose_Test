package com.example.domain.model.repository

import com.example.domain.model.response.NewsResponseDto
import com.example.domain.utils.State
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsFromRemote(searchQuery: String): Flow<State<NewsResponseDto?>>
}