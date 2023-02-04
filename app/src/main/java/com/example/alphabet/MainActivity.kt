package com.example.alphabet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.launch_screen)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClick(view: View) {
        val intent = Intent(this, SecondActivity_2::class.java)
        when (view.id) {
            R.id.button -> startActivity(intent)
        }
    }
        fun spravka(view: View) {
            val intent = Intent(this, spravkaActivity::class.java)
            when (view.id) {
                R.id.button -> startActivity(intent)
            }
        }
            fun ofprog(view: View) {
                val intent = Intent(this, OFprogActivity::class.java)
                when (view.id) {
                    R.id.button -> startActivity(intent)
                }
            }

}


