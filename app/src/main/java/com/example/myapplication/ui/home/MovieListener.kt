package com.example.myapplication.ui.home

interface MovieListener {
    fun onFetchStarted()
    fun onFetchFinished()
    fun onFailure(message: String)
}