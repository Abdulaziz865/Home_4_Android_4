package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class ProcessingDetails(
    @SerializedName("processingStatus")
    val processingStatus: String = "",
    @SerializedName("processingFailureReason")
    val processingFailureReason: String = "",
    @SerializedName("thumbnailsAvailability")
    val thumbnailsAvailability: String = "",
    @SerializedName("fileDetailsAvailability")
    val fileDetailsAvailability: String = "",
    @SerializedName("editorSuggestionsAvailability")
    val editorSuggestionsAvailability: String = "",
    @SerializedName("tagSuggestionsAvailability")
    val tagSuggestionsAvailability: String = "",
    @SerializedName("processingIssuesAvailability")
    val processingIssuesAvailability: String = "",
    @SerializedName("processingProgress")
    val processingProgress: ProcessingProgress
)