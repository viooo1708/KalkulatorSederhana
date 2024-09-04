package com.example.kalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var setAngka1 : EditText
    private lateinit var setAngka2 : EditText
    private lateinit var btnKurang : Button
    private lateinit var btnTambah : Button
    private lateinit var btnKali : Button
    private lateinit var txtHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setAngka1 = findViewById(R.id.etangka1)
        setAngka2 = findViewById(R.id.etangka2)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnKurang.setOnClickListener(){
            val hasil = setAngka1.text.toString().toInt() - setAngka2.text.toString().toInt()
            txtHasil.setText("Hasilnya adalah = " + hasil)
        }

        btnTambah.setOnClickListener(){
            val hasil = setAngka1.text.toString().toInt() + setAngka2.text.toString().toInt()
            txtHasil.setText("Hasilnya adalah = " + hasil)
        }

        btnKali.setOnClickListener(){
            val hasil = setAngka1.text.toString().toInt() * setAngka2.text.toString().toInt()
            txtHasil.setText("Hasilnya adalah = " + hasil)
        }
    }
}