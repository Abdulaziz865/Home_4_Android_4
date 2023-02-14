package com.example.home_4_android_4.data.models

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("license")
    val license: String = "",
    @SerializedName("selfDeclaredMadeForKids")
    val selfDeclaredMadeForKids: String = "",
    @SerializedName("failureReason")
    val failureReason: String = "",
    @SerializedName("privacyStatus")
    val privacyStatus: String = "",
    @SerializedName("publishAt")
    val publishAt: String = "",
    @SerializedName("uploadStatus")
    val uploadStatus: String = "",
    @SerializedName("rejectionReason")
    val rejectionReason: String = "",
    @SerializedName("publicStatsViewable")
    val publicStatsViewable: String = "",
    @SerializedName("embeddable")
    val embeddable: String = "",
    @SerializedName("madeForKids")
    val madeForKids: String = ""
)