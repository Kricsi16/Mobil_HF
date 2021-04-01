package com.example.anime_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar

class DeatilsActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatils)
        toolBar=findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
        toolBar.inflateMenu(R.menu.menu_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        /*val favouriteActionButton: AppCompatButton = findViewById(R.id.action_favourites)
        favouriteActionButton.setOnClickListener{
            val intent = Intent(this, FavouriteActivity::class.java)
            startActivity(intent)
        }

        val animelistActionButton: AppCompatButton = findViewById(R.id.action_animelist)
        animelistActionButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/
        return true

    }
}