package com.example.blogdoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Date

class AddArticalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_artical)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val title:EditText=findViewById(R.id.editTextText)
        val blog:EditText=findViewById(R.id.editTextText2)
        val btnPost: Button =findViewById(R.id.addBlogButton)

        btnPost.setOnClickListener {
            val currentDate = Date()
            val dateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
            val formattedDate = dateFormat.format(currentDate)
            val date=formattedDate.substring(0,10)
            val time=formattedDate.substring(11,16)
            val blog = BlogData(
                userName = "mohit13",
                date = date,
                time = time,
                title = title.text.toString(),
                blog = blog.text.toString(),
                isLiked = false,
                isSaved = false
            )
            BlogRepository.blogList.add(0,blog)
            startActivity(Intent(this@AddArticalActivity,MainActivity::class.java))
        }
    }
}