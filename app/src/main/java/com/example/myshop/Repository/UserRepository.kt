package com.example.myshop.Repository

import com.example.myshop.Api.ApiClient
import com.example.myshop.Api.ApiInterface
import com.example.myshop.Models.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UserRepository {

    class UserRepository {
        var apiClient =
            ApiClient.buildClient(ApiInterface::class.java)
        suspend fun getProducts(): Response<ProductResponse> {
            return withContext(Dispatchers.IO) {
                apiClient.getProducts()



            }
        }
    }
}