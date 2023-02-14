package com.example.home_4_android_4.data.remote.apiservices

import com.example.home_4_android_4.data.models.PopularVideo
import com.example.home_4_android_4.data.models.YoutubeResponce
import retrofit2.http.GET
import retrofit2.http.Query

interface PopularVideoApiService {

    @GET("videos")
    suspend fun fetchVideoCategories(
        @Query("regionCode") regionCode: String,
        @Query("chart") chart: String,
        @Query("part") part: String,
        @Query("pageToken") nextPageToken: String
    ): YoutubeResponce<PopularVideo>
}