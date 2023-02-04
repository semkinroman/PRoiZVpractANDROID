
package com.example.alphabet

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


var Acchetchiks:Int=0

class GeneralActivity : AppCompatActivity() {

    private var  timer:CountDownTimer?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glasnoe)
    }
    fun otadoa(view: View) {
        val diceImage: ImageButton = findViewById(R.id.imageButton)

        Acchetchiks += 1

        val newImage4: Button = findViewById(R.id.button4)
        val newImage10: Button = findViewById(R.id.button10)
        val newImage13: Button = findViewById(R.id.button13)
            timer?.cancel()
            timer = object : CountDownTimer(4000,1000){
                override fun onTick(timeM: Long)
                {
                    newImage4.isEnabled = false
                    newImage10.isEnabled = false
                    newImage13.isEnabled = false
                }
                override fun onFinish()
                {
                    newImage4.isEnabled = true
                    newImage10.isEnabled = true
                    newImage13.isEnabled = true
                }
            }

        when (Acchetchiks) {
            1 -> { //Воспроизведение файла
                diceImage.setImageResource(R.drawable.a)
                val mp = MediaPlayer.create(this, R.raw.aa)
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.b)
                val mp = MediaPlayer.create(this, R.raw.b)
                mp.start()
            }
            3 -> { //И так далее
                diceImage.setImageResource(R.drawable.ve)
                val mp = MediaPlayer.create(this, R.raw.ve)
                mp.start()
            }
            4 -> {
                diceImage.setImageResource(R.drawable.g)
                val mp = MediaPlayer.create(this, R.raw.g)
                mp.start()
            }
            5 -> {
                diceImage.setImageResource(R.drawable.d)
                val mp = MediaPlayer.create(this, R.raw.d)
                mp.start()
            }
            6 -> {
                diceImage.setImageResource(R.drawable.e)
                val mp = MediaPlayer.create(this, R.raw.e)
                mp.start()
            }
            7 -> {
                diceImage.setImageResource(R.drawable.ekrat)
                val mp = MediaPlayer.create(this, R.raw.ekrat)
                mp.start()
            }
            8 -> {
                diceImage.setImageResource(R.drawable.ge)
                val mp = MediaPlayer.create(this, R.raw.ge)
                mp.start()
            }
            9 -> {
                diceImage.setImageResource(R.drawable.z)
                val mp = MediaPlayer.create(this, R.raw.z)
                mp.start()
            }
            10 -> {
                diceImage.setImageResource(R.drawable.n)
                val mp = MediaPlayer.create(this, R.raw.n)
                mp.start()
            }
            11 -> {
                diceImage.setImageResource(R.drawable.nt)
                val mp = MediaPlayer.create(this, R.raw.nt)
                mp.start()
            }
            12 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.k)
                val mp = MediaPlayer.create(this, R.raw.k)
                mp.start()
            }
            13 -> {
                diceImage.setImageResource(R.drawable.l)
                val mp = MediaPlayer.create(this, R.raw.l)
                mp.start()
            }
            14 -> { //И так далее
                diceImage.setImageResource(R.drawable.m)
                val mp = MediaPlayer.create(this, R.raw.m)
                mp.start()
            }
            15 -> {
                diceImage.setImageResource(R.drawable.an)
                val mp = MediaPlayer.create(this, R.raw.an)
                mp.start()
            }
            16 -> {
                diceImage.setImageResource(R.drawable.o)
                val mp = MediaPlayer.create(this, R.raw.o)
                mp.start()
            }
            17 -> {
                diceImage.setImageResource(R.drawable.p)
                val mp = MediaPlayer.create(this, R.raw.p)
                mp.start()
            }
            18 -> {
                diceImage.setImageResource(R.drawable.r)
                val mp = MediaPlayer.create(this, R.raw.r)
                mp.start()
            }
            19 -> {
                diceImage.setImageResource(R.drawable.s)
                val mp = MediaPlayer.create(this, R.raw.s)
                mp.start()
            }
            20 -> {
                diceImage.setImageResource(R.drawable.t)
                val mp = MediaPlayer.create(this, R.raw.t)
                mp.start()
            }
            21 -> {
                diceImage.setImageResource(R.drawable.y)
                val mp = MediaPlayer.create(this, R.raw.y)
                mp.start()
            }
            22 -> {
                diceImage.setImageResource(R.drawable.f)
                val mp = MediaPlayer.create(this, R.raw.f)
                mp.start()
            }
            23 -> {
                diceImage.setImageResource(R.drawable.x)
                val mp = MediaPlayer.create(this, R.raw.x)
                mp.start()
            }
            24 -> { //И так далее
                diceImage.setImageResource(R.drawable.c)
                val mp = MediaPlayer.create(this, R.raw.c)
                mp.start()
            }
            25 -> {
                diceImage.setImageResource(R.drawable.ne)
                val mp = MediaPlayer.create(this, R.raw.he)
                mp.start()
            }
            26 -> {
                diceImage.setImageResource(R.drawable.sh)
                val mp = MediaPlayer.create(this, R.raw.sh)
                mp.start()
            }
            27 -> {
                diceImage.setImageResource(R.drawable.sha)
                val mp = MediaPlayer.create(this, R.raw.sha)
                mp.start()
            }
            28 -> {
                diceImage.setImageResource(R.drawable.tvzn)
                val mp = MediaPlayer.create(this, R.raw.tvzn)
                mp.start()
            }
            29 -> {
                diceImage.setImageResource(R.drawable.iiii)
                val mp = MediaPlayer.create(this, R.raw.iiii)
                mp.start()
            }
            30 -> {
                diceImage.setImageResource(R.drawable.mgzn)
                val mp = MediaPlayer.create(this, R.raw.mgzn)
                mp.start()
            }
            31 -> {
                diceImage.setImageResource(R.drawable.eeee)
                val mp = MediaPlayer.create(this, R.raw.eeee)
                mp.start()
            }
            32 -> {
                diceImage.setImageResource(R.drawable.you)
                val mp = MediaPlayer.create(this, R.raw.you)
                mp.start()
            }
            33 -> {
                diceImage.setImageResource(R.drawable.la)
                val mp = MediaPlayer.create(this, R.raw.la)
                mp.start()

            }
        }
    }

    fun backOTADOA(view: View) {
        val diceImage: ImageButton = findViewById(R.id.imageButton)
        if(Acchetchiks>0)
            Acchetchiks -= 1
        val newImage4: Button = findViewById(R.id.button4)
        val newImage10: Button = findViewById(R.id.button10)
        val newImage13: Button = findViewById(R.id.button13)
        timer?.cancel()
        timer = object : CountDownTimer(4000,1000){
            override fun onTick(timeM: Long)
            {
                newImage4.isEnabled = false
                newImage10.isEnabled = false
                newImage13.isEnabled = false
            }
            override fun onFinish()
            {
                newImage4.isEnabled = true
                newImage10.isEnabled = true
                newImage13.isEnabled = true
            }
        }
        when (Acchetchiks){
            1 -> { //Воспроизведение файла
                diceImage.setImageResource(R.drawable.a)
                val mp = MediaPlayer.create(this, R.raw.aa)
                mp.start()
            }
            2 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.b)
                val mp = MediaPlayer.create(this, R.raw.b)
                mp.start()
            }
            3 -> { //И так далее
                diceImage.setImageResource(R.drawable.ve)
                val mp = MediaPlayer.create(this, R.raw.ve)
                mp.start()
            }
            4 -> {
                diceImage.setImageResource(R.drawable.g)
                val mp = MediaPlayer.create(this, R.raw.g)
                mp.start()
            }
            5 -> {
                diceImage.setImageResource(R.drawable.d)
                val mp = MediaPlayer.create(this, R.raw.d)
                mp.start()
            }
            6 -> {
                diceImage.setImageResource(R.drawable.e)
                val mp = MediaPlayer.create(this, R.raw.e)
                mp.start()
            }
            7 -> {
                diceImage.setImageResource(R.drawable.ekrat)
                val mp = MediaPlayer.create(this, R.raw.ekrat)
                mp.start()
            }
            8 -> {
                diceImage.setImageResource(R.drawable.ge)
                val mp = MediaPlayer.create(this, R.raw.ge)
                mp.start()
            }
            9 -> {
                diceImage.setImageResource(R.drawable.z)
                val mp = MediaPlayer.create(this, R.raw.z)
                mp.start()
            }
            10 -> {
                diceImage.setImageResource(R.drawable.n)
                val mp = MediaPlayer.create(this, R.raw.n)
                mp.start()
            }
            11 -> {
                diceImage.setImageResource(R.drawable.nt)
                val mp = MediaPlayer.create(this, R.raw.nt)
                mp.start()
            }
            12 -> { //Воспроизведение другого файла
                diceImage.setImageResource(R.drawable.k)
                val mp = MediaPlayer.create(this, R.raw.k)
                mp.start()
            }
            13 -> {
                diceImage.setImageResource(R.drawable.l)
                val mp = MediaPlayer.create(this, R.raw.l)
                mp.start()
            }
            14 -> { //И так далее
                diceImage.setImageResource(R.drawable.m)
                val mp = MediaPlayer.create(this, R.raw.m)
                mp.start()
            }
            15 -> {
                diceImage.setImageResource(R.drawable.an)
                val mp = MediaPlayer.create(this, R.raw.an)
                mp.start()
            }
            16 -> {
                diceImage.setImageResource(R.drawable.o)
                val mp = MediaPlayer.create(this, R.raw.o)
                mp.start()
            }
            17 -> {
                diceImage.setImageResource(R.drawable.p)
                val mp = MediaPlayer.create(this, R.raw.p)
                mp.start()
            }
            18 -> {
                diceImage.setImageResource(R.drawable.r)
                val mp = MediaPlayer.create(this, R.raw.r)
                mp.start()
            }
            19 -> {
                diceImage.setImageResource(R.drawable.s)
                val mp = MediaPlayer.create(this, R.raw.s)
                mp.start()
            }
            20 -> {
                diceImage.setImageResource(R.drawable.t)
                val mp = MediaPlayer.create(this, R.raw.t)
                mp.start()
            }
            21 -> {
                diceImage.setImageResource(R.drawable.y)
                val mp = MediaPlayer.create(this, R.raw.y)
                mp.start()
            }
            22 -> {
                diceImage.setImageResource(R.drawable.f)
                val mp = MediaPlayer.create(this, R.raw.f)
                mp.start()
            }
            23 -> {
                diceImage.setImageResource(R.drawable.x)
                val mp = MediaPlayer.create(this, R.raw.x)
                mp.start()
            }
            24 -> { //И так далее
                diceImage.setImageResource(R.drawable.c)
                val mp = MediaPlayer.create(this, R.raw.c)
                mp.start()
            }
            25 -> {
                diceImage.setImageResource(R.drawable.ne)
                val mp = MediaPlayer.create(this, R.raw.he)
                mp.start()
            }
            26 -> {
                diceImage.setImageResource(R.drawable.sh)
                val mp = MediaPlayer.create(this, R.raw.sh)
                mp.start()
            }
            27 -> {
                diceImage.setImageResource(R.drawable.sha)
                val mp = MediaPlayer.create(this, R.raw.sha)
                mp.start()
            }
            28 -> {
                diceImage.setImageResource(R.drawable.tvzn)
                val mp = MediaPlayer.create(this, R.raw.tvzn)
                mp.start()
            }
            29 -> {
                diceImage.setImageResource(R.drawable.iiii)
                val mp = MediaPlayer.create(this, R.raw.iiii)
                mp.start()
            }
            30 -> {
                diceImage.setImageResource(R.drawable.mgzn)
                val mp = MediaPlayer.create(this, R.raw.mgzn)
                mp.start()
            }
            31 -> {
                diceImage.setImageResource(R.drawable.eeee)
                val mp = MediaPlayer.create(this, R.raw.eeee)
                mp.start()
            }
            32 -> {
                diceImage.setImageResource(R.drawable.you)
                val mp = MediaPlayer.create(this, R.raw.you)
                mp.start()
            }
            33 -> {
                diceImage.setImageResource(R.drawable.la)
                val mp = MediaPlayer.create(this, R.raw.la)
                mp.start()
            }
        }
    }

    fun backMENU(view: View) {
        val intent = Intent(this, SecondActivity_2::class.java)
        when(view.id){
            R.id.button13 ->startActivity(intent)
        }

    }


}
