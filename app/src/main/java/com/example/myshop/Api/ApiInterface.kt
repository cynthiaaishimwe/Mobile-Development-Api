package com.example.myshop.Api


import com.example.myshop.Models.Product
import com.example.myshop.Models.ProductResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface ApiInterface {

    @GET("/products")
    suspend fun getProducts(): Response<ProductResponse>

    @GET("/products/{id}")
    suspend fun getProducts(@Path("id") productId: Int): Response<Product>
}

