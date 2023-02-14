package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Standard(
    @SerializedName("width")
    val width: Int = 0,

    @SerializedName("url")
    val url: String = "",

    @SerializedName("height")
    val height: Int = 0
)