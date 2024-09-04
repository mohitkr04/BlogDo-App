package com.example.blogdoapp

import BlogAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BlogAdapter(BlogRepository.blogList)
        val btnPostBlog:FloatingActionButton=findViewById(R.id.floatingActionButton)
        btnPostBlog.setOnClickListener {
            startActivity(Intent(this@MainActivity,AddArticalActivity::class.java))
        }
    }
}