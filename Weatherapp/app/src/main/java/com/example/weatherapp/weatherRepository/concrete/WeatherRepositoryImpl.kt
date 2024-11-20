package com.example.weatherapp.weatherRepository.concrete

import com.example.weatherapp.WeatherApi
import com.example.weatherapp.data.City
import com.example.weatherapp.data.weather.WeatherResponse
import com.example.weatherapp.weatherRepository.WeatherRepository
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepositoryImpl
@Inject
constructor(private val weatherApi: WeatherApi) : WeatherRepository
{
    override suspend fun getCities(
        query: String,
        limit: Int,
        apiKey: String
    ): Response<List<City>> {
        return weatherApi
            .getCityResults(query,limit,apiKey)

    }

    override suspend fun getWeather(
        latitude: String,
        longitude: String,
        apiKey: String
    ): Response<WeatherResponse?> {
        return weatherApi.getWeather(latitude, longitude, apiKey)
    }
}