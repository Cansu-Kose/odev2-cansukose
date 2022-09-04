package com.dag.odev2fmss

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)

        val sp=getSharedPreferences("LoginInformation", Context.MODE_PRIVATE)

        if (binding.editTextUserName.toString() == "admin" && binding.editTextPassword.toString()=="admin"){
            binding.loginbutton.setOnClickListener {
                Toast.makeText(applicationContext,"Giriş Başarılı", Toast.LENGTH_SHORT).show()
            }
        }

    Toast.makeText(applicationContext,"Kayıt Başarılı", Toast.LENGTH_SHORT).show()


    }
}