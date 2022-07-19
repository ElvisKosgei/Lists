package com.example.androidlists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView: ListView = findViewById(R.id.listCities)

        //data
        val cities = arrayOf(
            "Washington-DC",
            "Toronto",
            "London",
            "Canberra",
            "Auckland",
            "Manchester",
            "Liverpool",
            "New Castle",
            "Kent",
            "Winnipeg",
            "Vancouver",
            "Nova Scotia",
            "Ottawa",
            "Calgary",
            "Edmonton"
        )
        Log.d("CITIES", "We have ${cities.size}")
        Log.d("XYZ", cities[0])


        //adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities)

        //telling the list which adapter to use

        myListView.adapter = adapter
        myListView.onItemClickListener = AdapterView.OnItemClickListener{_,_, position, id->
            val city = cities.get(position)
            Toast.makeText(this, city, Toast.LENGTH_SHORT).show()
            Log.d("CITIES", "Position is $position")
            Log.e("CITIES", "Position is e $position")

            val intet = Intent(this, SecondActivity::class.java)

            //passing data between activities
            intent.putExtra("position", position)

            //open the activity
            startActivity(intent)


        }
    }
}