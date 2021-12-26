package com.gokul.api

import com.gokul.api.services.KamAPI
import com.gokul.api.services.KamAuthAPI
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class KamClient {





    val okHttpBuilder=OkHttpClient.Builder()


    val retrofitBuilder=Retrofit.Builder().baseUrl("https://api.realworld.io/api/")
        .addConverterFactory(MoshiConverterFactory.create())

    val publicApi=retrofitBuilder.client(okHttpBuilder.build()).build().create(KamAPI::class.java)
    val authApi=retrofitBuilder.client(okHttpBuilder.build()).build().create(KamAuthAPI::class.java)
}