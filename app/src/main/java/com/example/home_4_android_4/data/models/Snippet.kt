package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Snippet(
    @SerializedName("defaultLanguage")
    val defaultLanguage: String = "",
    @SerializedName("publishedAt")
    val publishedAt: String = "",
    @SerializedName("defaultAudioLanguage")
    val defaultAudioLanguage: String = "",
    @SerializedName("localized")
    val localized: Localized,
    @SerializedName("description")
    val description: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("thumbnails")
    val thumbnails: Thumbnails,
    @SerializedName("channelId")
    val channelId: String = "",
    @SerializedName("categoryId")
    val categoryId: String = "",
    @SerializedName("channelTitle")
    val channelTitle: String = "",
    @SerializedName("tags")
    val tags: List<String>?,
    @SerializedName("liveBroadcastContent")
    val liveBroadcastContent: String = ""
)