package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class VideoStreamsItem(
    @SerializedName("codec")
    val codec: String = "",
    @SerializedName("vendor")
    val vendor: String = "",
    @SerializedName("rotation")
    val rotation: String = "",
    @SerializedName("frameRateFps")
    val frameRateFps: String = "",
    @SerializedName("heightPixels")
    val heightPixels: String = "",
    @SerializedName("aspectRatio")
    val aspectRatio: String = "",
    @SerializedName("bitrateBps")
    val bitrateBps: String = "",
    @SerializedName("widthPixels")
    val widthPixels: String = ""
)