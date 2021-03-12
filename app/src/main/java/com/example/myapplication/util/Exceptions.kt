package com.example.myapplication.util

import java.io.IOException

/**
 * Can be used to handle exceptions
 */
class NoInternetException(message: String) : IOException(message)
class ApiException(message: String) : IOException(message)