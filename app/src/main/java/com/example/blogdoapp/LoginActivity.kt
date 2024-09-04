package com.example.blogdoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var btnRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        btnLogin=findViewById(R.id.login_button)
        btnRegister=findViewById(R.id.btnRegister)
        etEmail=findViewById(R.id.txtEmail)
        etPassword=findViewById(R.id.txtPassword)
        btnLogin.setOnClickListener {
            if(etEmail.text.toString()=="mohitgupta.araria@gmail.com" && etPassword.text.toString()=="Mohit@1305"){
                Toast.makeText(this@LoginActivity,"Login Successful",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@LoginActivity,MainActivity::class.java))
            }else{
                Toast.makeText(this@LoginActivity,"Please Enter Correct Credentials ",Toast.LENGTH_SHORT).show()
            }
        }
        btnRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
        }
    }
}
//

