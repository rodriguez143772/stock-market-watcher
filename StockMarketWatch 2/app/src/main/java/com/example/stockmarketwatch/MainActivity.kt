package com.example.stockmarketwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.search_button)
        val chosenTicker = findViewById<EditText>(R.id.ticker)
        val name = findViewById<TextView>(R.id.stockName)
        val currentPrice = findViewById<TextView>(R.id.currentPrice)
        val percentChange = findViewById<TextView>(R.id.percentChange)
        button.setOnClickListener {
            val userGeneratedText = chosenTicker;

        }
    }
    fun fetchStockInfo(){
        val api = Retrofit.Builder()
            .baseUrl("https://api.finazon.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)

            api.getStock().enqueue(object : Callback<List<Comments>>)
                    }
                }
            }



}
