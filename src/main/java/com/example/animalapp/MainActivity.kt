package com.example.animalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val animals = listOf(
            Animal("Панда", R.drawable.panda),
            Animal("Собака", R.drawable.puppy),
            Animal("Кролик", R.drawable.rabbit),
            Animal("Красная панда", R.drawable.redpanda),
            Animal("Белка", R.drawable.squirrel),
        )

        val adapter = AnimalAdapter(animals)
        recyclerView.adapter = adapter
    }
}
