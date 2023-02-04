package com.example.alphabet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OFprogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ofprog)
    }
    fun backoforog(view: View) {
        val intent = Intent(this, SecondActivity_2::class.java)
        when (view.id) {
            R.id.button -> startActivity(intent)
        }
    }
}