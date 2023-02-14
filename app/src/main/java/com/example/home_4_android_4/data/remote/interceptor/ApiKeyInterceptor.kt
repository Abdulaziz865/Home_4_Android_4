package com.example.home_4_android_4.data.remote.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder().addQueryParameter("key", "AIzaSyB1uZA1XWoALG659Kr5WpO_uZ3H8Wu37QQ").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}