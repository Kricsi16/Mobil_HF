package com.example.anime_list

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: AnimeListAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var toolBar: Toolbar

    private fun initRecyclerview() {
        adapter = AnimeListAdapter()
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }

    fun loadItems() {
        adapter.initList(listOf("ALMA", "KÖRTE"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerview()
        loadItems()
        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
        toolBar.inflateMenu(R.menu.menu_main)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {


            R.id.action_animelist -> {
                true
            }
            R.id.action_favourites -> {
                val intent = Intent(this, FavouriteActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


}