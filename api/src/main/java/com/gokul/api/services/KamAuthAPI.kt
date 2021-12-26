package com.gokul.api.services

import com.gokul.api.models.entities.Article
import com.gokul.api.models.request.UserUpdateRequest
import com.gokul.api.models.response.ArticleResponse
import com.gokul.api.models.response.ArticlesResponse
import com.gokul.api.models.response.ProfileResponse
import com.gokul.api.models.response.UserResponse
import retrofit2.Response
import retrofit2.http.*

interface KamAuthAPI {

    @GET("user")
    suspend fun getCurrentUser():Response<UserResponse>

    @PUT("user")
    suspend fun updateCurrentUser(
        @Body userUpdateRequest:UserUpdateRequest
    ):Response<UserResponse>

    @GET("profiles/{username}")
    suspend fun getProfile(
        @Path ("username") username:String
    ):Response<ProfileResponse>

    @POST("profiles/{username}/follow")
    suspend fun followUser(
        @Path("username") username: String
    ):Response<ProfileResponse>

    @DELETE("profiles/{username}/follow")
    suspend fun unfollowUser(
        @Path("username") username: String
    ):Response<ProfileResponse>

    @GET("articles/feed")
    suspend fun getFeedArticles():Response<ArticlesResponse>

    @POST("articles/{slug}/favourite")
    suspend fun favouriteArticle(
        @Path("slug")slug:String
    ):Response<ArticleResponse>

    @DELETE("articles/{slug}/favourite")
    suspend fun unfavouriteArticle(
        @Path("slug") slug: String
    ):Response<ArticleResponse>


    @POST("articles")
    suspend fun createArticle(
        @Body article:Article
    )




}