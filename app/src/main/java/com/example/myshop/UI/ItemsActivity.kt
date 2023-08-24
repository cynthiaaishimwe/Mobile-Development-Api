package com.example.myshop.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myshop.R
import com.example.myshop.databinding.ActivityItemsBinding
import com.example.myshop.databinding.ActivityMainBinding
import com.example.myshop.viewModel.ProductsViewModel

//class ItemsActivity : AppCompatActivity() {
//    val itemsViewModel: ItemsViewModel by viewModels()
//    lateinit var binding: ActivityItemsBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityItemsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//    override fun onResume() {
//        super.onResume()
//        itemsViewModel.fetchProducts()
//        itemsViewModel.productsLiveData
//            .observe(this, Observer { itemList ->
//                Toast.makeText(
//                    baseContext,
//                    "fetched ${itemList.size} products",
//                    Toast.LENGTH_LONG
//                ).show()
//                binding.rvProductsItem.layoutManager= LinearLayoutManager(this@ItemsActivity)
//                binding.rvProductsItem.adapter=ProductsAdapter(itemList)
//            })
//        itemsViewModel.errorLiveData.observe(this, Observer { error ->
//            Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()
//        })
//    }
//}

