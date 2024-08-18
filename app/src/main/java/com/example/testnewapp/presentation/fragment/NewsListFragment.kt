package com.example.testnewapp.presentation.fragment

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.testnewapp.domain.viewmodel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@Composable
fun NewsListScreen(navController: NavHostController) {
    LazyColumn {
//        items(newsItems) { item ->
//            NewsItemCard(item = item) { itemId ->
//                navController.navigate("newsDetails/$itemId")
//            }
//        }
    }
}