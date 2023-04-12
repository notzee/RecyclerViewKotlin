package com.zevika.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailAnimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anime)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anime = intent.getParcelableExtra<Anime>(MainActivity.INTENT_PARCELABLE)


        val imgAnime = findViewById<ImageView>(R.id.img_item_photo)
        val nameAnime = findViewById<TextView>(R.id.tv_item_name)
        val descAnime = findViewById<TextView>(R.id.tv_item_description)



        imgAnime.setImageResource(anime?.imganime!!)
        nameAnime.text = anime.nameanime
        descAnime.text = anime.descanime

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}