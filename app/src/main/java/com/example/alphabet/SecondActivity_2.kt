package com.example.alphabet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class SecondActivity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    fun glasnoe(view: View) {
        val intent = Intent(this,Glasnoe ::class.java)
         when(view.id){
             R.id.button2 ->startActivity(intent)
         }
         }

    fun soglasnoe(view: View) {
        val intent = Intent(this,Soglasnoe ::class.java)
        when(view.id){
            R.id.button3 ->startActivity(intent)
        }
        }
    fun otadoa(view: View) {
        val intent = Intent(this,GeneralActivity ::class.java)
        when(view.id){
            R.id.button5 ->startActivity(intent)
        }
        }

}