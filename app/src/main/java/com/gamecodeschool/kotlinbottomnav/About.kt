package com.gamecodeschool.kotlinbottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class About : AppCompatActivity() {
    private lateinit var   bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.about


        bottomNavigationView.setOnItemSelectedListener (object:
            NavigationView.OnNavigationItemSelectedListener,
            NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.dashboard -> {
                        startActivity(Intent(applicationContext, DashBoard::class.java))
                        overridePendingTransition(0, 0)
                        return true}

                    R.id.home -> {
                        startActivity(Intent(applicationContext, MainActivity::class.java))
                        overridePendingTransition(0, 0)
                        return true
                    }
                    R.id.about -> return true

                }
                return false
            }

        } )
    }
}