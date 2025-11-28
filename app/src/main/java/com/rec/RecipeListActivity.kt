package com.rec

import android.widget.TextView
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rec.R
class RecipeListActivity : AppCompatActivity() {
    private val recipes = listOf("Борщ", "Окрошка", "Солянка", "Винегрет", "Оладьи")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        val category = intent.getStringExtra("category")
        findViewById<TextView?>(R.id.tvCategory)?.text = category ?: "Категория"

        val rv = findViewById<RecyclerView>(R.id.rvRecipes)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = SimpleAdapter(recipes) { recipe ->
            val i = Intent(this, RecipeDetailActivity::class.java)
            i.putExtra("recipe", recipe)
            startActivity(i)
        }
    }
}
