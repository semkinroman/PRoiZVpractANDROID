package com.example.alphabet

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity



var cchetchiks1:Int=0
class Soglasnoe : AppCompatActivity() {

  private  var  timer:CountDownTimer?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soglasnoe)
    }
    fun sschetchik1(view: View) {
        val diceImagel: ImageButton = findViewById(R.id.imageButton2)

        cchetchiks1 += 1

        val newImage15: Button = findViewById(R.id.button15)
        val newImage7: Button = findViewById(R.id.button7)
        val newImage16: Button = findViewById(R.id.button16)
        timer?.cancel()
        timer = object : CountDownTimer(4000,1000){
            override fun onTick(timeM: Long)
            {
                newImage15.isEnabled = false
                newImage7.isEnabled = false
                newImage16.isEnabled = false
            }
            override fun onFinish()
            {
                newImage15.isEnabled = true
                newImage7.isEnabled = true
                newImage16.isEnabled = true
            }
        }

        when (cchetchiks1) {
            1 -> { //Воспроизведение файла
                diceImagel.setImageResource(R.drawable.an)
                val mp = MediaPlayer.create(this, R.raw.an)// sound is inside res/raw/mysound                        mp.start()
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImagel.setImageResource(R.drawable.m)
                val mp = MediaPlayer.create(this, R.raw.m)
                mp.start()
            }
            3 -> { //И так далее
                diceImagel.setImageResource(R.drawable.l)
                val mp = MediaPlayer.create(this, R.raw.l)
                mp.start()
            }
            4 -> {
                diceImagel.setImageResource(R.drawable.r)
                val mp = MediaPlayer.create(this, R.raw.r)
                mp.start()
            }
            5 -> {
                diceImagel.setImageResource(R.drawable.nt)
                val mp = MediaPlayer.create(this, R.raw.nt)
                mp.start()
            }
            6 -> {
                diceImagel.setImageResource(R.drawable.b)
                val mp = MediaPlayer.create(this, R.raw.b)
                mp.start()
            }
            7 -> {
                diceImagel.setImageResource(R.drawable.p)
                val mp = MediaPlayer.create(this, R.raw.p)
                mp.start()
            }
            8 -> {
                diceImagel.setImageResource(R.drawable.ve)
                val mp = MediaPlayer.create(this, R.raw.ve)
                mp.start()
            }
            9 -> {
                diceImagel.setImageResource(R.drawable.f)
                val mp = MediaPlayer.create(this, R.raw.f)
                mp.start()
            }
            10 -> {
                diceImagel.setImageResource(R.drawable.g)
                val mp = MediaPlayer.create(this, R.raw.g)
                mp.start()
            }
            11 -> {
                diceImagel.setImageResource(R.drawable.k)
                val mp = MediaPlayer.create(this, R.raw.k)
                mp.start()
            }
            12 -> { //Воспроизведение другого файла
                diceImagel.setImageResource(R.drawable.d)
                val mp = MediaPlayer.create(this, R.raw.d)
                mp.start()
            }
            13 -> {
                diceImagel.setImageResource(R.drawable.t)
                val mp = MediaPlayer.create(this, R.raw.t)
                mp.start()
            }
            14 -> { //И так далее
                diceImagel.setImageResource(R.drawable.ge)
                val mp = MediaPlayer.create(this, R.raw.ge)
                mp.start()
            }
            15 -> {
                diceImagel.setImageResource(R.drawable.sh)
                val mp = MediaPlayer.create(this, R.raw.sh)
                mp.start()
            }
            16 -> {
                diceImagel.setImageResource(R.drawable.z)
                val mp = MediaPlayer.create(this, R.raw.z)
                mp.start()
            }
            17 -> {
                diceImagel.setImageResource(R.drawable.s)
                val mp = MediaPlayer.create(this, R.raw.s)
                mp.start()
            }
            18 -> {
                diceImagel.setImageResource(R.drawable.x)
                val mp = MediaPlayer.create(this, R.raw.x)
                mp.start()
            }
            19 -> {
                diceImagel.setImageResource(R.drawable.c)
                val mp = MediaPlayer.create(this, R.raw.c)
                mp.start()
            }
            20 -> {
                diceImagel.setImageResource(R.drawable.ne)
                val mp = MediaPlayer.create(this, R.raw.he)
                mp.start()
            }
            21 -> {
                diceImagel.setImageResource(R.drawable.sha)
                val mp = MediaPlayer.create(this, R.raw.sha)
                mp.start()
            }
            22 -> {
                diceImagel.setImageResource(R.drawable.tvzn)
                val mp = MediaPlayer.create(this, R.raw.tvzn)
                mp.start()
            }
            23 -> {
                diceImagel.setImageResource(R.drawable.mgzn)
                val mp = MediaPlayer.create(this, R.raw.mgzn)
                mp.start()
            }

        }

    }
    fun backSchetchik1(view: View) {
        val diceImagel: ImageButton = findViewById(R.id.imageButton2)
        if(cchetchiks1>0)
            cchetchiks1 -= 1

        val newImage15: Button = findViewById(R.id.button15)
        val newImage7: Button = findViewById(R.id.button7)
        val newImage16: Button = findViewById(R.id.button16)
        timer?.cancel()
        timer = object : CountDownTimer(4000,1000){
            override fun onTick(timeM: Long)
            {
                newImage15.isEnabled = false
                newImage7.isEnabled = false
                newImage16.isEnabled = false
            }
            override fun onFinish()
            {
                newImage15.isEnabled = true
                newImage7.isEnabled = true
                newImage16.isEnabled = true
            }
        }
        when (cchetchiks1) {
            1 -> { //Воспроизведение файла
                diceImagel.setImageResource(R.drawable.an)
                val mp = MediaPlayer.create(this, R.raw.an)// sound is inside res/raw/mysound                        mp.start()
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImagel.setImageResource(R.drawable.m)
                val mp = MediaPlayer.create(this, R.raw.m)
                mp.start()
            }
            3 -> { //И так далее
                diceImagel.setImageResource(R.drawable.l)
                val mp = MediaPlayer.create(this, R.raw.l)
                mp.start()
            }
            4 -> {
                diceImagel.setImageResource(R.drawable.r)
                val mp = MediaPlayer.create(this, R.raw.r)
                mp.start()
            }
            5 -> {
                diceImagel.setImageResource(R.drawable.nt)
                val mp = MediaPlayer.create(this, R.raw.nt)
                mp.start()
            }
            6 -> {
                diceImagel.setImageResource(R.drawable.b)
                val mp = MediaPlayer.create(this, R.raw.b)
                mp.start()
            }
            7 -> {
                diceImagel.setImageResource(R.drawable.p)
                val mp = MediaPlayer.create(this, R.raw.p)
                mp.start()
            }
            8 -> {
                diceImagel.setImageResource(R.drawable.ve)
                val mp = MediaPlayer.create(this, R.raw.ve)
                mp.start()
            }
            9 -> {
                diceImagel.setImageResource(R.drawable.f)
                val mp = MediaPlayer.create(this, R.raw.f)
                mp.start()
            }
            10 -> {
                diceImagel.setImageResource(R.drawable.g)
                val mp = MediaPlayer.create(this, R.raw.g)
                mp.start()
            }
            11 -> {
                diceImagel.setImageResource(R.drawable.k)
                val mp = MediaPlayer.create(this, R.raw.k)
                mp.start()
            }
            12 -> { //Воспроизведение другого файла
                diceImagel.setImageResource(R.drawable.d)
                val mp = MediaPlayer.create(this, R.raw.d)
                mp.start()
            }
            13 -> {
                diceImagel.setImageResource(R.drawable.t)
                val mp = MediaPlayer.create(this, R.raw.t)
                mp.start()
            }
            14 -> { //И так далее
                diceImagel.setImageResource(R.drawable.ge)
                val mp = MediaPlayer.create(this, R.raw.ge)
                mp.start()
            }
            15 -> {
                diceImagel.setImageResource(R.drawable.sh)
                val mp = MediaPlayer.create(this, R.raw.sh)
                mp.start()
            }
            16 -> {
                diceImagel.setImageResource(R.drawable.z)
                val mp = MediaPlayer.create(this, R.raw.z)
                mp.start()
            }
            17 -> {
                diceImagel.setImageResource(R.drawable.s)
                val mp = MediaPlayer.create(this, R.raw.s)
                mp.start()
            }
            18 -> {
                diceImagel.setImageResource(R.drawable.x)
                val mp = MediaPlayer.create(this, R.raw.x)
                mp.start()
            }
            19 -> {
                diceImagel.setImageResource(R.drawable.c)
                val mp = MediaPlayer.create(this, R.raw.c)
                mp.start()
            }
            20 -> {
                diceImagel.setImageResource(R.drawable.ne)
                val mp = MediaPlayer.create(this, R.raw.he)
                mp.start()
            }
            21 -> {
                diceImagel.setImageResource(R.drawable.sha)
                val mp = MediaPlayer.create(this, R.raw.sha)
                mp.start()
            }
            22 -> {
                diceImagel.setImageResource(R.drawable.tvzn)
                val mp = MediaPlayer.create(this, R.raw.tvzn)
                mp.start()
            }
            23 -> {
                diceImagel.setImageResource(R.drawable.mgzn)
                val mp = MediaPlayer.create(this, R.raw.mgzn)
                mp.start()
            }
        }
    }


    fun backsoglasnoe1(view: View) {
        val intent = Intent(this, SecondActivity_2::class.java)
        when(view.id){
            R.id.button7 ->startActivity(intent)
        }
        cchetchiks1=0
    }

}
