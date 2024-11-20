package com.example.weatherapp.ui.data

import com.example.weatherapp.data.City
import com.example.weatherapp.data.weather.WeatherResponse

sealed interface WeatherScreenState {
    data object Loading : WeatherScreenState
    data object NoData: WeatherScreenState
    data class Success(
        val cities: List<City>,
        val weatherResponse: WeatherResponse?
    ): WeatherScreenState
}