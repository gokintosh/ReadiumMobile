package com.gokul.kameleonmobile.data

import com.gokul.api.KamClient

object ArticlesRepo {


    val api=KamClient().api


    suspend fun getGlobalFeed()= api.getArticles()
}