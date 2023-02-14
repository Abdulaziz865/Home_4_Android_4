package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class RegionRestriction(
    @SerializedName("blocked")
    val blocked: List<String>?,
    @SerializedName("allowed")
    val allowed: List<String>?
)