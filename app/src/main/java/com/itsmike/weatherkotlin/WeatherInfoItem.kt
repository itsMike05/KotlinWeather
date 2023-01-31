package com.itsmike.weatherkotlin

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun WeatherInfoItem (@DrawableRes iconRes: Int, title: String, subtitle: String, modifier: Modifier) {

    Row() {
        Image(painter = painterResource(id = iconRes), contentDescription = null)
    }
    
    Text(text = title)
}