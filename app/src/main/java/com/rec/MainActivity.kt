package com.rec

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.rec.R

class MainActivity : AppCompatActivity() {
    private val categories = listOf("Супы", "Салаты", "Десерты", "Напитки", "Выпечка", "Соусы")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvCategories)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = SimpleAdapter(categories) { category ->
            val i = Intent(this, RecipeListActivity::class.java)
            i.putExtra("category", category)
            startActivity(i)
        }
    }
}
