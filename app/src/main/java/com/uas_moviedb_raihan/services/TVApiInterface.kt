package com.uas_moviedb_raihan.services



import com.uas_moviedb_raihan.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=401f33ac51d45bea16cdb64d7662ae19")
    fun getTVList(): Call<TVResponse>
}