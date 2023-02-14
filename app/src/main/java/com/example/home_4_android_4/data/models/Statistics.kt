package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Statistics(
    @SerializedName("dislikeCount")
    val dislikeCount: String = "",
    @SerializedName("likeCount")
    val likeCount: String = "",
    @SerializedName("viewCount")
    val viewCount: String = "",
    @SerializedName("favoriteCount")
    val favoriteCount: String = "",
    @SerializedName("commentCount")
    val commentCount: String = ""
)