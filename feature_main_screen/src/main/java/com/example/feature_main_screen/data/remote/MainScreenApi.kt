package com.example.feature_main_screen.data.remote

import com.example.feature_main_screen.data.remote.dto.MainScreenResponse
import retrofit2.http.GET

interface MainScreenApi {

    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun fetchMainScreenItemsFromApi() : MainScreenResponse


    companion object {
        const val BASE_URL = "https://run.mocky.io/"
    }
}