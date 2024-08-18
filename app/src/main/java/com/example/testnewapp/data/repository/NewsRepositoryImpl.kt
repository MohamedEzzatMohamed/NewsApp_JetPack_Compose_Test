package com.example.testnewapp.data.repository

import com.example.domain.model.response.NewsResponseDto
import com.example.testnewapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NewsRepositoryImpl(): NewsRepository{
//    override fun getAllNews(): Flow<List<NewsResponseDto>> = flow{
//        TODO("Not yet implemented")
//    }

}

/*
*
* class FruitRepositoryImpl (private val fruitDao: FruitDao): FruitRepository {
    override suspend fun insertFruit(fruit: Fruits) = fruitDao.insertFruit(fruit)
    override fun getAllFruits(): Flow<List<Fruits>> = fruitDao.getAllFruits()
}
* */