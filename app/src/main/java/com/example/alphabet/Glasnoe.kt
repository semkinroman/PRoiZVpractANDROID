
package com.example.alphabet

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton

var cchetchiks:Int=0
class Glasnoe : AppCompatActivity() {

    private var  timer:CountDownTimer?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glasnoe)
    }
    fun sschetchik(view: View) {
        val diceImage: ImageButton = findViewById(R.id.imageButton)
        cchetchiks += 1

        val newImage6: Button = findViewById(R.id.button6)
        val newImage8: Button = findViewById(R.id.button8)
        val newImage9: Button = findViewById(R.id.button9)
        timer?.cancel()
        timer = object : CountDownTimer(4000,1000){
            override fun onTick(timeM: Long)
            {
                newImage6.isEnabled = false
                newImage8.isEnabled = false
                newImage9.isEnabled = false
            }
            override fun onFinish()
            {
                newImage6.isEnabled = true
                newImage8.isEnabled = true
                newImage9.isEnabled = true
            }
        }

        when (cchetchiks) {
            1 -> { //Воспроизведение файла
                diceImage.setImageResource(R.drawable.a)
                val mp = MediaPlayer.create(this, R.raw.aa)
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.o)
                val mp = MediaPlayer.create(this, R.raw.o)
                mp.start()
            }
            3 -> { //И так далее
                diceImage.setImageResource(R.drawable.y)
                val mp = MediaPlayer.create(this, R.raw.y)
                mp.start()
            }
            4 -> {
                diceImage.setImageResource(R.drawable.iiii)
                val mp = MediaPlayer.create(this, R.raw.iiii)
                mp.start()
            }
            5 -> {
                diceImage.setImageResource(R.drawable.eeee)
                val mp = MediaPlayer.create(this, R.raw.eeee)
                mp.start()
            }
            6 -> {
                diceImage.setImageResource(R.drawable.la)
                val mp = MediaPlayer.create(this, R.raw.la)
                mp.start()
            }
            7 -> {
                diceImage.setImageResource(R.drawable.ekrat)
                val mp = MediaPlayer.create(this, R.raw.ekrat)
                mp.start()
            }
            8 -> {
                diceImage.setImageResource(R.drawable.you)
                val mp = MediaPlayer.create(this, R.raw.you)
                mp.start()
            }
            9 -> {
                diceImage.setImageResource(R.drawable.n)
                val mp = MediaPlayer.create(this, R.raw.n)
                mp.start()
            }
            10 -> {
                diceImage.setImageResource(R.drawable.e)
                val mp = MediaPlayer.create(this, R.raw.e)
                mp.start()
            }
        }
    }

    fun backSchetchik(view: View) {
        val diceImage: ImageButton = findViewById(R.id.imageButton)
        if(cchetchiks>0)
            cchetchiks -= 1

        val newImage6: Button = findViewById(R.id.button6)
        val newImage8: Button = findViewById(R.id.button8)
        val newImage9: Button = findViewById(R.id.button9)
        timer?.cancel()
        timer = object : CountDownTimer(4000,1000){
            override fun onTick(timeM: Long)
            {
                newImage6.isEnabled = false
                newImage8.isEnabled = false
                newImage9.isEnabled = false
            }
            override fun onFinish()
            {
                newImage6.isEnabled = true
                newImage8.isEnabled = true
                newImage9.isEnabled = true
            }
        }
        when (cchetchiks){
            1 -> { //Воспроизведение файла
                diceImage.setImageResource(R.drawable.a)
                val mp = MediaPlayer.create(this, R.raw.aa)
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.o)
                val mp = MediaPlayer.create(this, R.raw.o)
                mp.start()
            }
            3 -> { //И так далее
                diceImage.setImageResource(R.drawable.y)
                val mp = MediaPlayer.create(this, R.raw.y)
                mp.start()
            }
            4 -> {
                diceImage.setImageResource(R.drawable.iiii)
                val mp = MediaPlayer.create(this, R.raw.iiii)
                mp.start()
            }
            5 -> {
                diceImage.setImageResource(R.drawable.eeee)
                val mp = MediaPlayer.create(this, R.raw.eeee)
                mp.start()
            }
            6 -> {
                diceImage.setImageResource(R.drawable.la)
                val mp = MediaPlayer.create(this, R.raw.la)
                mp.start()
            }
            7 -> {
                diceImage.setImageResource(R.drawable.ekrat)
                val mp = MediaPlayer.create(this, R.raw.ekrat)
                mp.start()
            }
            8 -> {
                diceImage.setImageResource(R.drawable.you)
                val mp = MediaPlayer.create(this, R.raw.you)
                mp.start()
            }
            9 -> {
                diceImage.setImageResource(R.drawable.n)
                val mp = MediaPlayer.create(this, R.raw.n)
                mp.start()
            }
            10 -> {
                diceImage.setImageResource(R.drawable.e)
                val mp = MediaPlayer.create(this, R.raw.e)
                mp.start()
            }
        }
    }

    fun backglasnoe(view: View) {
        val intent = Intent(this, SecondActivity_2::class.java)
        when(view.id){
            R.id.button6 ->startActivity(intent)
        }

    }


}
