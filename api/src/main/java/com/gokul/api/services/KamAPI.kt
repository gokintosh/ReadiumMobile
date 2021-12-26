package com.gokul.api.services

import com.gokul.api.models.request.LoginRequest
import com.gokul.api.models.request.SignUpRequest
import com.gokul.api.models.response.ArticlesResponse
import com.gokul.api.models.response.TagsResponse
import com.gokul.api.models.response.UserResponse
import retrofit2.Response
import retrofit2.http.*

interface KamAPI {


    @POST("users")
    suspend fun signupUser(
        @Body userCreds:SignUpRequest
    ):Response<UserResponse>


    @POST("users/login")
    suspend fun loginUser(
        @Body userCreds:LoginRequest
    ):Response<UserResponse>

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author:String?=null,
        @Query("favourited") favourited:String?=null,
        @Query("tag") tags:List<String>?=null
    ):Response<ArticlesResponse>

    @GET("articles/{slug}")
    suspend fun getArticleBySlug(
        @Path("slug") slug:String
    ):Response<ArticlesResponse>


    @GET("tags")
    suspend fun getTags():Response<TagsResponse>
}