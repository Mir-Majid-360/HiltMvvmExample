package com.majid.hiltmvvmexample.retrofit

import com.majid.hiltmvvmexample.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
  suspend  fun getProducts(): Response<List<Product>>
}