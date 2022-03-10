package com.example.veganbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veganbuddy.databinding.ActivityRideDetailsBinding

class RideDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRideDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRideDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnMap.setOnClickListener {
            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
    }
}