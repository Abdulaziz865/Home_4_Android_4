package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Player(
    @SerializedName("embedHeight")
    val embedHeight: String = "",
    @SerializedName("embedWidth")
    val embedWidth: String = "",
    @SerializedName("embedHtml")
    val embedHtml: String = ""
)