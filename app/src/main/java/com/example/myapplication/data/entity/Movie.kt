package com.example.myapplication.data.entity

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bumptech.glide.Glide
import com.example.myapplication.R


@Entity(tableName = "Movie")
data class Movie(
    val adult: Boolean,
    val backdrop_path: String?,
    @PrimaryKey(autoGenerate = false)
    val id: Int, // 419704
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) {
    companion object {
        @JvmStatic
        @BindingAdapter("android:imageUri")
        fun bindImage(view: View, poster_path: String) {
            val image = view.findViewById<ImageView>(R.id.imageView)
            Glide.with(view)
                .load("https://image.tmdb.org/t/p/w500/${poster_path}")
                .thumbnail(Glide.with(view).load(R.drawable.tenor))
                .into(image)
        }
    }
}