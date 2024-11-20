package com.example.weatherapp.weatherRepository

import com.example.weatherapp.data.City
import com.example.weatherapp.data.weather.WeatherResponse
import retrofit2.Response

interface WeatherRepository {
    suspend fun getCities(query: String, limit: Int, apiKey:String): Response<List<City>>

    suspend fun getWeather(  latitude: String,
                             longitude: String,
                             apiKey : String): Response<WeatherResponse?>
}