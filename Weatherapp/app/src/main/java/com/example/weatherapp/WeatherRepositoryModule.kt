package com.example.weatherapp

import com.example.weatherapp.weatherRepository.WeatherRepository
import com.example.weatherapp.weatherRepository.concrete.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface WeatherRepositoryModule {
    @Binds
    fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}