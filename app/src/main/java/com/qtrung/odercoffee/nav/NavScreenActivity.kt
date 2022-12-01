package com.qtrung.odercoffee.nav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.qtrung.odercoffee.R
import com.qtrung.odercoffee.databinding.ActivityNavBinding

class NavScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}