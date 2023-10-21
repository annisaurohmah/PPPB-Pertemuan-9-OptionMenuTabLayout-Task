package com.example.tabloginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.tabloginregister.databinding.ActivityHomeBinding
import com.example.tabloginregister.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
           }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_logout -> {
                Toast.makeText(this@HomeActivity, "Logout", Toast.LENGTH_SHORT).show()
                val intentToMainActivity = Intent(this@HomeActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}