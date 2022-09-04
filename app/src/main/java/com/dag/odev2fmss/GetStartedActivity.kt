package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var  binding:ActivityGetStartedBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myIntent = Intent(this,SignUpActivity::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_get_started)
        binding.joinbutton.setOnClickListener {
            startActivity(myIntent)
    }
 }
}