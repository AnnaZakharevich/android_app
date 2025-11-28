package com.rec

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rec.R

class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipe = intent.getStringExtra("recipe") ?: "Рецепт"
        findViewById<TextView>(R.id.tvTitle).text = recipe
        // Можно менять картинку в зависимости от рецепта
        findViewById<TextView>(R.id.tvIngredientsList).text = "• Пример ингредиента 1\n• Пример 2"
        findViewById<TextView>(R.id.tvStepsList).text = "1. Шаг первый...\n2. Шаг второй..."
    }
}
