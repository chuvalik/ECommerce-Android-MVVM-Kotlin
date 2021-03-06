package com.example.feature_details_screen.data.mapper

import com.example.feature_details_screen.data.remote.dto.ProductDetailsDto
import com.example.feature_details_screen.domain.model.ProductDetailsDomain

fun ProductDetailsDto.toProductDetailsDomain(): ProductDetailsDomain {
    return ProductDetailsDomain(
        cpu = cpu,
        camera = camera,
        capacity = capacity,
        color = color,
        id = id.toInt(),
        images = images,
        isFavorites = isFavorites,
        price = price.toString(),
        rating = rating.toFloat(),
        sd = sd,
        ssd = ssd,
        title = title
    )
}