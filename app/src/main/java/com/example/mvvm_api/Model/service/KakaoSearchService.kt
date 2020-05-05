package com.example.mvvm_api.Model.service

import com.example.mvvm_api.Model.response.ImageSearchResponse
import com.example.mvvm_api.Model.response.VideoSearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoSearchService {
    @GET("/v2/search/image")
    fun searchImage(
        @Header("Authorization") auth:String,
        @Query("query") query:String,
        @Query("sort") sort:String,
        @Query("page") page:Int,
        @Query("size") size:Int
    ): Single<ImageSearchResponse>

    @GET("/v2/search/vclip")
    fun searchVideo(
        @Header("Authorization") auth:String,
        @Query("query") query:String,
        @Query("sort") sort:String,
        @Query("page") page:Int,
        @Query("size") size:Int
    ): Single<VideoSearchResponse>
}