package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class ProcessingProgress(
    @SerializedName("partsProcessed")
    val partsProcessed: String = "",
    @SerializedName("timeLeftMs")
    val timeLeftMs: String = "",
    @SerializedName("partsTotal")
    val partsTotal: String = ""
)