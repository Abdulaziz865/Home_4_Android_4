package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class MangaResponce<T>(
    @SerializedName("data")
    val data: List<T>
)