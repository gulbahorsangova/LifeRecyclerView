package com.example.liferecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = ArrayList<RecyclerViewItem>()
        list.add(RecyclerViewItem(R.drawable.photo1, "Меняй свои баллы на звонки в    Россию"))
        list.add(RecyclerViewItem(R.drawable.photo2, "Меняй свои баллы на звонки в Россию"))
        list.add(RecyclerViewItem(R.drawable.photo3, "Меняй свои баллы на звонки в Россию"))

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = RecyclerViewAdapter(list)
    }


}