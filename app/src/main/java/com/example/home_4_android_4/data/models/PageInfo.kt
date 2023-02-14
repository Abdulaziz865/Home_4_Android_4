package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class PageInfo(
    @SerializedName("totalResults")
    val totalResults: String = "",
    @SerializedName("resultsPerPage")
    val resultsPerPage: String = ""
)