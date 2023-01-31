package com.itsmike.weatherkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itsmike.weatherkotlin.ui.theme.WeatherKotlinTheme

@Composable
fun WeatherIcon() {
    Image(
        painter = painterResource(id = R.drawable.ic_logo),
        contentDescription = "App Logo",
        modifier = Modifier
            .width(200.dp)
    )
}


@Preview (showBackground = true)
@Composable
fun IconPreview() {
    WeatherKotlinTheme() {
        WeatherIcon()
    }
}
