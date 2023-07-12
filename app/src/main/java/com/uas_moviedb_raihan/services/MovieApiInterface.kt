package com.uas_moviedb_raihan.services

import com.uas_moviedb_raihan.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=401f33ac51d45bea16cdb64d7662ae19")
    fun getMovieList(): Call<MovieResponse>

}