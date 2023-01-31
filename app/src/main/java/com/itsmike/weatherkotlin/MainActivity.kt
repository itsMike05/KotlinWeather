package com.itsmike.weatherkotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.RepeatableSpec
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.itsmike.weatherkotlin.ui.theme.WeatherKotlinTheme
import org.json.JSONObject
import java.net.URL

class MainActivity : ComponentActivity() {

    // example API call https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

    val API_KEY = "ded5328a22d01eda8aae560363fa549f"
    val CITY = "Bydgoszcz"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherKotlinTheme {
                Surface(color = MaterialTheme.colors.background) {
                    CallTheApi()
                    WeatherPage()
                }
            }
        }
    }


    fun CallTheApi(){

        val url = "https://api.openweathermap.org/data/2.5/weather?q=${CITY}&appid=${API_KEY}"
        val resultJson = URL(url).readText()
        val jsonObj = JSONObject(resultJson)

        Log.d("JSON", jsonObj.getJSONObject("main").toString())
        Log.d("JSON", jsonObj.getJSONObject("temp").toString())

//        val queue = Volley.newRequestQueue(this)
//        val jsonObjectRequest = JsonObjectRequest(
//            Request.Method.GET, url, null,
//            { response ->
//                Log.d("TAG", "Success!")
//            },
//            { error ->
//                Log.d("TAG", "Something went wrong")
//                error.printStackTrace()
//            },
//        )
//        Log.d("TAG", url)
//
//        queue.add(jsonObjectRequest)
    }

}
//
@Composable
fun WeatherPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 30.dp,
                start = 15.dp,
                end = 15.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WeatherIcon()
        WeatherInfo()
        WeatherInfoTable()
    }
}

@Preview (showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun AppPreview() {
    WeatherKotlinTheme{
        WeatherPage()
    }

}