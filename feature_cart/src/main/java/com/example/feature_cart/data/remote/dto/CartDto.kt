package com.example.feature_cart.data.remote.dto

data class CartDto(
    val basket: List<BasketDto>,
    val delivery: String,
    val id: String,
    val total: Int
)