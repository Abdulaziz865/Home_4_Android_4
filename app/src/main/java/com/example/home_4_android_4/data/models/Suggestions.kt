package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Suggestions(
    @SerializedName("processingWarnings")
    val processingWarnings: List<String>?,
    @SerializedName("processingErrors")
    val processingErrors: List<String>?,
    @SerializedName("editorSuggestions")
    val editorSuggestions: List<String>?,
    @SerializedName("processingHints")
    val processingHints: List<String>?,
    @SerializedName("tagSuggestions")
    val tagSuggestions: List<TagSuggestionsItem>?
)