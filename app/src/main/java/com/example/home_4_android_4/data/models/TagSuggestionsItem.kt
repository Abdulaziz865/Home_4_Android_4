package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class TagSuggestionsItem(
    @SerializedName("tag")
    val tag: String = "",
    @SerializedName("categoryRestricts")
    val categoryRestricts: List<String>?
)