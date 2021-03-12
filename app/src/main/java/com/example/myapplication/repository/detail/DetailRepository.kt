package com.example.myapplication.repository.detail


import com.example.myapplication.data.entity.MovieDetail
import com.example.myapplication.data.response.SimilarResponse
import com.example.myapplication.service.ApiService
import io.reactivex.Observable
import javax.inject.Inject

class DetailRepository @Inject constructor(val service: ApiService) {

    /**
     * to get the movies by id
     */
    fun getMovieById(id: String, key: String): Observable<MovieDetail> {
        return service.getMovieDetail(id, key)
    }

    /**
     * to get the similar movies
     */
    fun getSimilarMovies(id: String, key: String): Observable<SimilarResponse> {
        return service.getSimilarMovies(id, key)
    }
}