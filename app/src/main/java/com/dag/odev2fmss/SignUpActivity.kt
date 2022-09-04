package com.dag.odev2fmss

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var  binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)

        val sp=getSharedPreferences("LoginInformation",Context.MODE_PRIVATE)

        binding.signupbutton.setOnClickListener {

            val email=binding.editTextTextEmailAddress.text.toString()
            val username=binding.editTextTextPersonName.text.toString()
            val password=binding.editTextTextPassword.text.toString()

            if (email=="admin" && username=="admin" && password=="admin"){
                val editor=sp.edit()
                editor.putString("username",username)
                editor.putString("email",email)
                editor.putString("password",password)

                startActivity(Intent(this@SignUpActivity,LoginActivity::class.java))

            }else{
                Toast.makeText(applicationContext,"Hatalı Giriş",Toast.LENGTH_SHORT).show()
            }
        }
    }
}