package com.example.githubapp.api

import com.example.githubapp.data.model.DetailUserResponse
import com.example.githubapp.data.model.User
import com.example.githubapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token aff11c91f66663b48ba9521b88ad4ce40fbbefce")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token aff11c91f66663b48ba9521b88ad4ce40fbbefce")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token aff11c91f66663b48ba9521b88ad4ce40fbbefce")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token aff11c91f66663b48ba9521b88ad4ce40fbbefce")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}