package com.example.feature_main_screen.data.remote.dto

data class BestSellerDto(
    val discount_price: Int,
    val id: Int,
    val is_favorites: Boolean,
    val picture: String,
    val price_without_discount: Int,
    val title: String
)