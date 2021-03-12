package com.example.myapplication.data.response

import com.example.myapplication.data.entity.Dates
import com.example.myapplication.data.entity.Movie

data class UpcomingResponse(
    val dates: Dates,
    val page: Int, // 1
    val results: List<Movie>,
    val total_pages: Int, // 8
    val total_results: Int // 148
)