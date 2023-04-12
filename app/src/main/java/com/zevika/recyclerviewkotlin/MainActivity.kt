package com.zevika.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

   companion object{
       val INTENT_PARCELABLE = "OBJECT_INTENT"

   }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animelist = listOf<Anime>(
            Anime(
                R.drawable.jjsu,
                "Jujutsu Kaisen",
                "Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. However, this leisurely lifestyle soon takes a turn for the strange when he unknowingly encounters a cursed item. Triggering a chain of supernatural occurrences, Yuuji finds himself suddenly thrust into the world of Curses—dreadful beings formed from human malice and negativity—after swallowing the said item, revealed to be a finger belonging to the demon Sukuna Ryoumen, the \"King of Curses    2023. "

            ),
            Anime(
                R.drawable.demon,
                "Kimetsu no Yaiba",
                "Ever since the death of his father, the burden of supporting the family has fallen upon Tanjirou Kamado's shoulders. Though living impoverished on a remote mountain, the Kamado family are able to enjoy a relatively peaceful and happy life. One day, Tanjirou decides to go down to the local village to make a little money selling charcoal. On his way back, night falls, forcing Tanjirou to take shelter in the house of a strange man, who warns him of the existence of flesh-eating demons that lurk in the woods at night."

            ),
            Anime(
                R.drawable.haikyu,
                "Haikyuu!!",
                "Ever since having witnessed the \"Little Giant\" and his astonishing skills on the volleyball court, Shouyou Hinata has been bewitched by the dynamic nature of the sport. Even though his attempt to make his debut as a volleyball regular during a middle school tournament went up in flames, he longs to prove that his less-than-impressive height ceases to be a hindrance in the face of his sheer will and perseverance."

            ),
            Anime(
                R.drawable.chainsaw,
                "Chainsaw Man",
                "Denji is robbed of a normal teenage life, left with nothing but his deadbeat father's overwhelming debt. His only companion is his pet, the chainsaw devil Pochita, with whom he slays devils for money that inevitably ends up in the yakuza's pockets. All Denji can do is dream of a good, simple life: one with delicious food and a beautiful girlfriend by his side. But an act of greedy betrayal by the yakuza leads to Denji's brutal, untimely death, crushing all hope of him ever achieving happiness."

            ),
            Anime(
                R.drawable.tokyo,
                "Tokyo Revengers",
                "Takemichi Hanagaki's second year of middle school was the highest point in his life. He had respect, a gang of friends he could count on, and even a girlfriend. But that was twelve years ago. Today, he's a nobody: a washed-up nonentity made fun of by children and always forced to apologize to his younger boss. A sudden news report on the Tokyo Manji Gang's cruel murder of the only girlfriend he ever had alongside her brother only adds insult to injury. Half a second before a train ends his pitiful life for good, Takemichi flashes back to that same day 12 years ago, when he was still dating Hinata Tachibana."

            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapterAnime(this, animelist){
            val intent = Intent(this,DetailAnimeActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }
    }
}