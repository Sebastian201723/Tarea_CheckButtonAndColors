package com.unicauca.checkbox

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    amarillo.setOnClickListener(this::CambiarBg)
    azul.setOnClickListener(this::CambiarBg)
    rojo.setOnClickListener(this::CambiarBg)
}

fun CambiarBg(view: View){

    if(amarillo.isChecked) {

        if (azul.isChecked && !rojo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#00FF00"))
        else if (rojo.isChecked && !azul.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#ff8000"))
        else if (rojo.isChecked && azul.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#ffffff"))
        else {window.decorView.setBackgroundColor(Color.parseColor("#FFFF00"))}
    }
    else if(azul.isChecked) {

        if (amarillo.isChecked && !rojo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#00FF00"))
        else if (rojo.isChecked && !amarillo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#572354"))
        else if (amarillo.isChecked && rojo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#FFFFff"))
        else window.decorView.setBackgroundColor(Color.parseColor("#0000ff"))
    }
    else if(rojo.isChecked) {

        if (azul.isChecked && !amarillo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#572354"))
        else if (amarillo.isChecked && !azul.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#ff8000"))
        else if (amarillo.isChecked && rojo.isChecked) window.decorView.setBackgroundColor(Color.parseColor("#ffffff"))
        else {window.decorView.setBackgroundColor(Color.parseColor("#ff0000"))}
    }
    else  window.decorView.setBackgroundColor(Color.parseColor("#000000"))
}
}

