package com.isaacrf.android_mvvm_beercatalog.features.beer_master_detail.services

import androidx.lifecycle.LiveData
import com.isaacrf.android_mvvm_beercatalog.features.beer_master_detail.models.Beer
import com.isaacrf.android_mvvm_beercatalog.shared.api.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit beer service implementation
 */
interface BeerListService: iBeerListService {
    /**
     * @GET Method. Retrieves all beers
     */
    @GET("beers")
    override fun getBeers(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): LiveData<ApiResponse<List<Beer>>>
}