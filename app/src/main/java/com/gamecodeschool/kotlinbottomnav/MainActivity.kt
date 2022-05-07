package com.gamecodeschool.kotlinbottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

private lateinit var   bottomNavigationView: BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigasiBawah()

    }
    private fun navigasiBawah(){
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.home


        bottomNavigationView.setOnItemSelectedListener (object:
            NavigationView.OnNavigationItemSelectedListener,
            NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.dashboard -> {
                        startActivity(Intent(applicationContext, DashBoard::class.java))
                        overridePendingTransition(0, 0)
                        return true
                    }
                    R.id.home -> return true
                    R.id.about -> {
                        startActivity(Intent(applicationContext, About::class.java))
                        overridePendingTransition(0, 0)
                        return true
                    }
                }
                return false
            }

        } )
    }
}