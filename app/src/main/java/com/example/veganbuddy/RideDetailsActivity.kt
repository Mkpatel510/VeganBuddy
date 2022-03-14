package com.example.veganbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.veganbuddy.databinding.ActivityRideDetailsBinding

class RideDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRideDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRideDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intent = intent
        val code =  intent.getStringExtra("CODE")
        binding.txtDest.setText(code)
//        val desti = findViewById<EditText>(R.id.txtDest)
//        desti.text = "CODE"+code+"";
        binding.btnMap.setOnClickListener {
            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
    }
}