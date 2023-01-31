package com.itsmike.weatherkotlin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.itsmike.weatherkotlin.ui.theme.LighterGray

@Composable
fun WeatherInfoTable () {
    Column {

        Row() {
            WeatherInfoItem(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                subtitle = "72%",
                modifier = Modifier.weight(1f)
            )
            WeatherInfoItem(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                subtitle = "72%",
                modifier = Modifier.weight(1f)
            )
        }
        Divider(color = LighterGray)
        Row() {
            WeatherInfoItem(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                subtitle = "72%",
                modifier = Modifier.weight(1f)
            )
            WeatherInfoItem(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                subtitle = "72%",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview (showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun TablePreview() {
    WeatherInfoTable()
}