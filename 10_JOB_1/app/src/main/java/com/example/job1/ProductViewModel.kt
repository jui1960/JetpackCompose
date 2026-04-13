package com.example.job1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    // ApiService instance
    private val apiService = ApiClient.api

    // Products LiveData
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products

    // Loading state
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    // Error state
    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    // Refresh状態
    private val _isRefreshing = MutableLiveData<Boolean>()
    val isRefreshing: LiveData<Boolean> = _isRefreshing

    fun fetchProducts() {
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val response = apiService.getProducts()
                _products.value = response
                _error.value = null
            } catch (e: Exception) {
                _error.value = e.message ?: "Unknown error occurred"
            } finally {
                _isLoading.value = false
            }
        }
    }


}