package com.example.alphabet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class spravkaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spravka)
    }

    fun onClick8(view: View) {
        val intent = Intent(this, spravkaActivity::class.java)
        when (view.id) {
            R.id.button -> startActivity(intent)
        }
    }
}