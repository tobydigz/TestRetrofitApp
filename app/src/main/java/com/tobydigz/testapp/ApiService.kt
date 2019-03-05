package com.tobydigz.testapp

import io.reactivex.Completable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    companion object {
        const val baseUrl = BuildConfig.BASE_URL
    }

    @GET("api/agent-network/transaction/v1/getStatus")
    fun getStatus(
        @Header("Authorization") authorization: String,
        @Query("reference") reference: String
    ): Completable
}