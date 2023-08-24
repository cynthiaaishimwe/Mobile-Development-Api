package com.example.myshop.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myshop.Models.Product
import com.example.myshop.databinding.ItemProductBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

//
//class ItemsAdapter2 (var productList:List<items>): RecyclerView.Adapter<ItemViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ItemViewHolder {
//        val binding =
//            ItemProductBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
//        return ItemViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
//        var currentProduct = itemsList[position]
//        var  binding=holder.binding
//        binding.tvId.text=currentProduct.id.toString()
//        binding.tvTitle.text=currentProduct.title.toString()
//        binding.tvDescription.text=currentProduct.description.toString()
//        binding.tvPrice.text=currentProduct.price.toString()
//        binding.tvRating.text=currentProduct.rating.toString()
//        binding.tvStock.text=currentProduct.stock.toString()
//        binding.tvCategory.text=currentProduct.category.toString()
//
//        Picasso
//            .get()
//            .load(currentProduct.thumbnail)
//            .transform(CropCircleTransformation())
//            .into(binding.ivThumbnail)
//
//    }
//    override fun getItemCount(): Int {
//        return itemsList.size
//    }
//}
//class ItemViewHolder( var binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root)
