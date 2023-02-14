package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class FileDetails(
    @SerializedName("container")
    val container: String = "",
    @SerializedName("fileName")
    val fileName: String = "",
    @SerializedName("creationTime")
    val creationTime: String = "",
    @SerializedName("fileSize")
    val fileSize: String = "",
    @SerializedName("videoStreams")
    val videoStreams: List<VideoStreamsItem>?,
    @SerializedName("audioStreams")
    val audioStreams: List<AudioStreamsItem>?,
    @SerializedName("durationMs")
    val durationMs: String = "",
    @SerializedName("bitrateBps")
    val bitrateBps: String = "",
    @SerializedName("fileType")
    val fileType: String = ""
)