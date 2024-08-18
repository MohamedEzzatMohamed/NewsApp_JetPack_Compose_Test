package com.example.domain.utils


sealed interface State<out T> {
    data class Success<T>(val data: T) : State<T>
    data class Error(val exception: String?) : State<Nothing>
    object Loading : State<Nothing>
}