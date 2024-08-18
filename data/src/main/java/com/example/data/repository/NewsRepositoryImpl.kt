package com.example.data.repository

import android.util.Log
import com.example.data.local.NewsListDao
import com.example.data.network_service.ApiService
import com.example.domain.model.repository.NewsRepository
import com.example.domain.model.response.NewsResponseDto
import com.example.domain.utils.State
import com.example.domain.utils.asResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NewsRepositoryImpl(
    private val apiService: ApiService,
    private val newsListDao: NewsListDao
) : NewsRepository {

    override suspend fun getNewsFromRemote(searchQuery: String): Flow<State<NewsResponseDto?>> {
//        return flow {
//            try {
//                val response = apiService.getNewsList(searchQuery)
//                if (response.isSuccessful) {
//                    insertNewsIntoLocal(response.body()!!)
//                    State.Success(response.body()!!)
//                } else {
//                    getNewsFromLocal()
//                }
//            } catch (ex: Exception) {
//                getNewsFromLocal()
//            }
//        }.asResult()
        return flow {  }
    }

    private fun insertNewsIntoLocal(list: NewsResponseDto) {
        try {
            newsListDao.insert(list)
        } catch (e: Exception) {
            Log.d("Exception", e.localizedMessage!!)
        }
    }

    private fun getNewsFromLocal(): State<NewsResponseDto?> {
        return try {
            State.Success(newsListDao.getNews())
        } catch (error: Exception) {
            State.Error(error.localizedMessage)
        }
    }
}