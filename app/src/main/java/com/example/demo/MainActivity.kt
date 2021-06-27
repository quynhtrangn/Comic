package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        val mainFragment = MainFragment()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.nav_host_fragment,mainFragment)
//            commit()
//        }
    }
}