package com.example.anime_list.ui.favourite

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.anime_list.R
import com.example.anime_list.model.AnimeDto
import com.example.anime_list.ui.main.MainActivity
import javax.inject.Inject

class FavouriteActivity: AppCompatActivity() {

    @Inject
    lateinit var favouritePresenter: FavouritePresenter


    private lateinit var adapter: FavouriteListAdapter
    private lateinit var recyclerView:RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    private fun initRecyclerview(){
        adapter= FavouriteListAdapter()
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }
     fun showFavourites(animes: List<AnimeDto>) {
        //swipeRefreshLayoutAnimes.isRefreshing = false
        adapter?.initList(animes)

    }



     fun showNetworkError(errorMsg: String) {

        Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)
        initRecyclerview()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_animelist -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true}
            R.id.action_favourites ->{true}
            else -> super.onOptionsItemSelected(item)
        }
    }
}