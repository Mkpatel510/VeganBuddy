package com.example.veganbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class RestaurantActivity : AppCompatActivity() {


    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            listView = findViewById<ListView>(R.id.recipe_list_view)

            val recipeList = Recipe.getRecipesFromFile("recipes.json", this)

            val adapter = RecipeAdapter(this, recipeList)
            listView.adapter = adapter

            val context = this
            listView.setOnItemClickListener { _, _, position, _ ->
                val selectedRecipe = recipeList[position]
                val intent = Intent(this,MapsActivity::class.java)
                startActivity(intent)

            }
        }
    }
