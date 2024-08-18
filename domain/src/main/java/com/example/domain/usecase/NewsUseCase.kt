package com.example.domain.usecase

import com.example.domain.model.repository.NewsRepository
import com.example.domain.model.response.NewsResponseDto
import com.example.domain.utils.State
import kotlinx.coroutines.flow.Flow

class GetNewsUseCase(private val newsRepo: NewsRepository) {

    suspend operator fun invoke(searchQuery: String): Flow<State<NewsResponseDto?>> =
        newsRepo.getNewsFromRemote(searchQuery)
}