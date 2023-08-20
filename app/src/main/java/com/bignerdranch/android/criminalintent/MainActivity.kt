package com.bignerdranch.android.criminalintent


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            val fragment = CrimeListFragment.newInstance()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit()
        }
        Log.d("MassageLog", "onCreate запущенно")

    }

    override fun onStart() {
        super.onStart()
        Log.d("MassageLog", "OnStart запущенно")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MassageLog", "OnPause запущено")
    }
}