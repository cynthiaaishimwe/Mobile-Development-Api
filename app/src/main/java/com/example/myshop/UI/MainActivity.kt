package com.example.myshop.UI


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myshop.Models.Product
import com.example.myshop.Models.ProductResponse
import com.example.myshop.Api.ApiClient
import com.example.myshop.Api.ApiInterface
import com.example.myshop.databinding.ActivityMainBinding
import com.example.myshop.viewModel.ProductsViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    val productsViewModel: ProductsViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        productsViewModel.fetchProducts()
        productsViewModel.productsLiveData
            .observe(this, Observer { productsList ->
                Toast.makeText(
                    baseContext,
                    "fetched ${productsList.size} products",
                    Toast.LENGTH_LONG
                ).show()
                binding.rvProductsItem.layoutManager= LinearLayoutManager(this@MainActivity)
                  binding.rvProductsItem.adapter=ProductsAdapter(productsList)
            })
        productsViewModel.errorLiveData.observe(this, Observer { error ->
            Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()
        })
    }
}
















//    fun getProducts() {
//        val retrofit = ApiClient.buildClient(ApiInterface::class.java)
//        val request = retrofit.getProducts()
//        request.enqueue(object : Callback<ProductResponse> {
//            override fun onResponse(
//                call: Call<ProductResponse>,
//                response: Response<ProductResponse>
//            ) {
//                if (response.isSuccessful) {
//                    var productResponse = response.body()?.products
//
//                    var productAdapter= ProductsAdapter(productResponse?: emptyList())
//                    binding.rvProductsItem.layoutManager= LinearLayoutManager(this@MainActivity)
//                    binding.rvProductsItem.adapter=productAdapter
//
//                    Toast
//                        .makeText(
//                            baseContext,
//                            "fetched ${productList?.size} products",
//                            Toast.LENGTH_LONG
//                        )
//                        .show()
//
//                } else {
//                    Toast.makeText(baseContext, response.errorBody()?.string(), Toast.LENGTH_LONG)
//                        .show()
//                }
//
//            }
//            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
//                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
//            }
//        })
//
//    }
//}
//
//
//
//
//
//
//
//
