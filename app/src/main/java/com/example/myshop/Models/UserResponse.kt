package com.example.myshop.Models

class UserResponse {

    data class UserResponse (
        var products: List<Users>,
        var total: Int,
        var skip: Int,
        var limit: Int,
    )

}