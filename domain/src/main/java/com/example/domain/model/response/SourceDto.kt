package com.example.domain.model.response

import android.os.Parcelable
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize

@Parcelize
@Serializable
data class SourceDto(
    val id: String,
    val name: String
): Parcelable