package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondFragment = SecondFragment()
        val homeFragment  = HomeFragment()
        val  fragmentManager = supportFragmentManager
        btn_add.setOnClickListener {
           fragmentManager.beginTransaction()
               .add(R.id.liner_contenier, homeFragment)
               .addToBackStack(homeFragment.toString())
               .commit()
        }
        btn_Remove.setOnClickListener {
            fragmentManager.beginTransaction()
                .remove(homeFragment)
                .commit()
        }
        btn_hide.setOnClickListener {
            fragmentManager.beginTransaction()
                .hide(homeFragment)
                .commit()
        }
        btn_Show.setOnClickListener {
            fragmentManager.beginTransaction()
                .show(homeFragment)
                .commit()
        }
        btn_replace.setOnClickListener {
            fragmentManager.beginTransaction()
                .addToBackStack(secondFragment.toString())
                .replace(R.id.liner_contenier, secondFragment)
                .commit()

        }


    }
}