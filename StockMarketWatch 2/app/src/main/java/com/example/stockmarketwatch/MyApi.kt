package com.example.stockmarketwatch

import retrofit2.http.GET
import retrofit2.Call


interface MyApi{
    @GET("/quote?symbol=AAPL")
    fun getStock(): Call<List<Stock>>
}