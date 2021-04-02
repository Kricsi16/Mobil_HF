package com.example.anime_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class DeatilsActivity : AppCompatActivity() {


    lateinit var title_text: TextView
    lateinit var original_title_text: TextView
    lateinit var director_text: TextView
    lateinit var producer_text: TextView
    lateinit var release_date_text: TextView
    lateinit var score_text: TextView
    lateinit var description_text: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatils)
        val title=intent.getStringExtra("Title")
        val original_title=intent.getStringExtra("Original_title")
        val director=intent.getStringExtra("Director")
        val producer=intent.getStringExtra("Producer")
        val release_date=intent.getStringExtra("Release_date")
        val score=intent.getStringExtra("Score")
        val description=intent.getStringExtra("Description")

        title_text=findViewById(R.id.title)
        original_title_text= findViewById(R.id.original_title)
        director_text= findViewById(R.id.director)
        producer_text=findViewById(R.id.producer)
        release_date_text=findViewById(R.id.release_date)
        score_text=findViewById(R.id.score)
        description_text=findViewById(R.id.description)


        title_text.text=title
        original_title_text.text=original_title
        director_text.text=director
        producer_text.text=producer
        release_date_text.text=release_date
        score_text.text=score
        description_text.text=description
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
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
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