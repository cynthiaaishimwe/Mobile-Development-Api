package com.example.myshop.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myshop.Models.Product
import com.example.myshop.Repository.ProductRepository
import kotlinx.coroutines.launch


class ProductsViewModel : ViewModel(){
    val productRepo=ProductRepository()
    var productsLiveData = MutableLiveData<List<Product>>()
    var errorLiveData = MutableLiveData<String>()

    fun fetchProducts(){
        viewModelScope.launch {
            val response=productRepo.getProducts()
           if (response.isSuccessful){
              productsLiveData.postValue(response.body()?.products)
           }
           else{
                errorLiveData.postValue(response.errorBody()?.string())
         }
        }
    }


}
