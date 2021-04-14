package com.example.anime_list.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.anime_list.R
import com.example.anime_list.model.AnimeDto
import com.example.anime_list.ui.favourite.FavouriteActivity


class MainActivity : AppCompatActivity(), MainScreen{

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

    override fun showAnimes(animes: List<AnimeDto>) {
        //swipeRefreshLayoutAnimes.isRefreshing = false
        adapter?.initList(animes)

    }

    override fun showNetworkError(errorMsg: String) {

        Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show()
    }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerview()

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