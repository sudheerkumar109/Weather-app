package com.example.weatherapp.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.weatherapp.ui.landing.LandingScreen
import com.example.weatherapp.ui.weather.WeatherRoute
import com.example.weatherapp.viewmodel.WeatherViewModel


fun NavController.navigateToWeather(){
    navigate(WeatherScreenDestination.route)
}

fun NavGraphBuilder.weatherGraph(navigateToWeather: () -> Unit,
                                 weatherViewModel: WeatherViewModel){

    composable(route = LandingScreenDestination.route){
        LandingScreen(navigateToWeather = navigateToWeather,
            viewModel = weatherViewModel)
    }
    composable(route = WeatherScreenDestination.route){
        WeatherRoute()
    }

}