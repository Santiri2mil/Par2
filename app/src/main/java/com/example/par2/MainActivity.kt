package com.example.par2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val irPeli: Button =findViewById<Button>(R.id.btnPeli)
        irPeli?.setOnClickListener{Peliculas()}
    }
    fun Peliculas(){
        val cN= Intent(this,MoviesActivity::class.java)
        startActivity(cN)
    }
}