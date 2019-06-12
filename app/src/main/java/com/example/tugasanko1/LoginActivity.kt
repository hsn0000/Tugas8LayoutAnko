package com.example.tugasanko1

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tugasanko1.MainActivity
import com.example.tugasanko1.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {

    companion object {
        lateinit var et_nama : EditText
        lateinit var btn_login : Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewLogin().setContentView(this)
        btn_login.setOnClickListener {
            startActivity<MainActivity>("nama" to et_nama.text.toString())
            finish()
        }
    }

    class ViewLogin : AnkoComponent<LoginActivity>{
        override fun createView(ui: AnkoContext<LoginActivity>) = with(ui){
            verticalLayout {
                lparams {
                    //                    gravity = Gravity.CENTER
//                    centerInParent()
                    width = matchParent
                    height = matchParent
                    verticalGravity = Gravity.CENTER
                    backgroundColor = Color.parseColor("#ffd700")
                    padding = 50
                }
                verticalLayout {
                    lparams(matchParent, wrapContent) {
                        background = ResourcesCompat.getDrawable(resources, R.drawable.bgco, null)
                    }
                    textView {
                        text = "HALLO..!"
                        textSize = 15.0f
                        textColor = Color.BLACK
                        textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    }.lparams(matchParent, wrapContent) {
                        margin = 25
                    }
                    et_nama = editText{
                        hint = "Masukan Nama Pengguna"
                    }.lparams(matchParent, wrapContent) {
                        margin = 30
                    }
                    btn_login = button {
                        text = "MASUK"
                        backgroundColor = Color.BLACK
                        textColor = Color.WHITE
                    }.lparams(wrapContent, wrapContent) {
                        margin = 30
                        gravity = Gravity.CENTER_HORIZONTAL
                    }
                }
            }
        }

    }
}