package com.example.testnewapp.domain.viewmodel

import androidx.lifecycle.ViewModel
import com.example.data.network_service.ApiService
import com.example.testnewapp.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository,
    private val apiService: ApiService
) : ViewModel() {

}