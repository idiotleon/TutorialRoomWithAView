package com.idiotleon.tutorialroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idiotleon.tutorialroom.R
import com.idiotleon.tutorialroom.adapter.WordListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMain = findViewById<RecyclerView>(R.id.rv_main)
        rvMain.adapter = WordListAdapter(this)
        rvMain.layoutManager = LinearLayoutManager(this)
    }
}