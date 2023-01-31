package com.itsmike.weatherkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itsmike.weatherkotlin.ui.theme.WeatherKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherKotlinTheme {
                Surface(color = MaterialTheme.colors.background) {
                    WeatherPage()
                }
            }
        }
    }
}


@Composable
fun WeatherPage() {

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(
                top = 30.dp,
                start = 80.dp,
                end = 80.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WeatherIcon()
    }

}



// PIXEL XL PREVIEW DIMENSIONS
@Preview (showBackground = true, widthDp = 412, heightDp = 712)
@Composable
fun AppPreview() {
    WeatherKotlinTheme() {
        WeatherPage()
    }
}