package com.example.home_4_android_4.ui.fragments

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.home_4_android_4.base.BaseViewModel
import com.example.home_4_android_4.data.repositories.PopularVideoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PopularVideoViewModel @Inject constructor(private val repository: PopularVideoRepository): BaseViewModel(){

    fun fetchPopularVideo(regionCode: String, chart: String, part: String) =
        repository.fetchPopularVideo(regionCode, chart, part).cachedIn(viewModelScope)
}