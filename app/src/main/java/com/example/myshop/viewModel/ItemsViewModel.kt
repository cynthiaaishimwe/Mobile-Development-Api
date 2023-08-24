package com.example.myshop.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myshop.Models.Product
import com.example.myshop.Repository.ProductRepository
import com.example.myshop.Repository.UserRepository
import kotlinx.coroutines.launch

//class ItemsViewModel : ViewModel(){
//    val itemsRepo= UserRepository()
//    var itemsLiveData = MutableLiveData<List<items>>()
//    var errorLiveData = MutableLiveData<String>()
//
//    fun fetchProducts(){
//        viewModelScope.launch {
//            val response=itemsRepo.getProducts()
//            if (response.isSuccessful){
//                itemsLiveData.postValue(response.body()?.items)
//            }
//            else{
//                errorLiveData.postValue(response.errorBody()?.string())
//            }
//        }
//    }
//
//
//}
