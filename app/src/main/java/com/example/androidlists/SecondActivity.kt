package com.example.androidlists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtName : TextView = findViewById(R.id.txtCity)
        val textposition : TextView = findViewById(R.id.txtPosition)

        val intent : Intent = intent
        val nameOfCity = intent.getStringExtra("name")
        val positionOfCity = intent.getIntExtra("position", 0)
        Log.d("CITY", "$nameOfCity")

        txtName.text = nameOfCity
        textposition.text = positionOfCity.toString()

        val actionBar = supportActionBar
        actionBar!!.title = nameOfCity

    }
}