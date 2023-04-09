package com.example.converter.data.api

import com.example.converter.model.cash.Cash
import com.example.converter.model.nocash.NoCash
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoney():Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getNoCashMoney():Response<NoCash>
}