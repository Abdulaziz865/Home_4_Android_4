package com.example.home_4_android_4.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.home_4_android_4.base.BaseRepository
import com.example.home_4_android_4.data.remote.apiservices.PopularVideoApiService
import com.example.home_4_android_4.data.remote.pagingsources.VideoPopularPagingSources
import javax.inject.Inject

class PopularVideoRepository @Inject constructor(private val apiService: PopularVideoApiService): BaseRepository() {

    fun fetchPopularVideo(regionCode: String, chart: String, part: String) =
        Pager(PagingConfig(pageSize = 10, enablePlaceholders = false)) {
            VideoPopularPagingSources(apiService, regionCode, chart, part)
        }.liveData
}