package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class LiveStreamingDetails(
    @SerializedName("activeLiveChatId")
    val activeLiveChatId: String = "",
    @SerializedName("actualStartTime")
    val actualStartTime: String = "",
    @SerializedName("scheduledStartTime")
    val scheduledStartTime: String = "",
    @SerializedName("scheduledEndTime")
    val scheduledEndTime: String = "",
    @SerializedName("actualEndTime")
    val actualEndTime: String = "",
    @SerializedName("concurrentViewers")
    val concurrentViewers: String = ""
)