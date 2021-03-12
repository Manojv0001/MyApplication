package com.example.myapplication.data.response

import com.example.myapplication.data.entity.Movie

data class SimilarResponse(
    val page: Int, // 1
    val results: List<Movie>,
    val total_pages: Int, // 30
    val total_results: Int // 591
)