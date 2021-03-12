package com.example.myapplication.ui.adapter

import com.example.myapplication.R
import com.example.myapplication.data.entity.Movie
import com.example.myapplication.databinding.MovieItemBinding
import com.example.myapplication.di.ui.BaseRecyclerViewAdapter

class HomeRecylerAdapter : BaseRecyclerViewAdapter<Movie, MovieItemBinding>() {

    /**
     * to get the layout
     */
    override fun getLayout(): Int {
        return R.layout.movie_item
    }

    /**
     * to perform the bind operations
     */
    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<MovieItemBinding>,
        position: Int
    ) {
        holder.binding.movie = items[position]
        //onclick event
        holder.binding.root.setOnClickListener {
            listener?.invoke(it, items[position], position)
        }
    }
}