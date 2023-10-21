package com.example.tabloginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.tabloginregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private var TAG = "MainActivityBerjalan"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            viewPager.adapter = TabAdapter(supportFragmentManager)
// Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
        }


    }

}