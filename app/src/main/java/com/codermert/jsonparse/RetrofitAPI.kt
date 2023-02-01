package com.codermert.jsonparse

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {

    @GET("demoo.json")
    fun getCourse(): Call<CourseDataModal?>?
}