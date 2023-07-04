package com.example.myshop

import java.util.concurrent.ConcurrentSkipListMap

 data class ProductResponse (
    var products: List<Product>,
    var total: Int,
    var skip: Int,
    var limit: Int,
)

