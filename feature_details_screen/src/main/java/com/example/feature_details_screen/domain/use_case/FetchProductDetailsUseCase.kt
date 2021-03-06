package com.example.feature_details_screen.domain.use_case

import com.example.feature_details_screen.domain.repository.DetailsScreenRepository

class FetchProductDetailsUseCase(
    private val repository: DetailsScreenRepository
) {

    suspend operator fun invoke() = repository.fetchProductDetails()
}