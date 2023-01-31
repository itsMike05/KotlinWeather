package com.itsmike.weatherkotlin

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun WeatherIcon() {
    Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "App Logo")
}