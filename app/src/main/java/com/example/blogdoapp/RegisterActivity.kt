package com.example.blogdoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {

   // @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var etEmail: EditText
        lateinit var etPassword: EditText
        lateinit var etConfirmPassword:EditText
        lateinit var etName:EditText
        lateinit var btnLogin: Button
        lateinit var btnRegister: Button
        setContentView(R.layout.activity_register)
        etName=findViewById(R.id.etName)
        btnLogin=findViewById(R.id.login_button)
        btnRegister=findViewById(R.id.btnRegister)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.Password)
        etConfirmPassword=findViewById(R.id.txtPassword)
        btnLogin.setOnClickListener {
            startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
        }
        btnRegister.setOnClickListener {
            if(etName.text.toString().length<3){
                Toast.makeText(this@RegisterActivity,"Name should have more than 3 characters",Toast.LENGTH_SHORT).show()
            }else if(!etEmail.text.toString().contains('.')){
                Toast.makeText(this@RegisterActivity,"Enter correct email",Toast.LENGTH_SHORT).show()
            }else if(etPassword.text.toString().length<8){
                Toast.makeText(this@RegisterActivity,"Password must have at least 8 characters",Toast.LENGTH_SHORT).show()
            }else if(etPassword.text.toString()!=etConfirmPassword.text.toString()){
                Toast.makeText(this@RegisterActivity,"Enter same password",Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this@RegisterActivity,"Error while registering , please try again after some time",Toast.LENGTH_SHORT).show()
            }
        }
    }
}