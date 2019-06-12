package com.example.tugasanko1


import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var nama : TextView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewMain().setContentView(this)
        nama.text = intent.getStringExtra("nama")
    }

    override fun onBackPressed() {
        alert("Yakin Keluar", "Warning!!!") {
            positiveButton("Iya"){
                finish()
            }
            negativeButton("Tidak") {
                //
            }
        }.show()
    }

    class ViewMain : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            verticalLayout {
                lparams {
                    width = matchParent
                    height = matchParent
                    padding = 75
                }
                textView {
                    text = "Welcome"
                }.lparams(wrapContent, wrapContent)
                nama = textView {
                    textSize = 25.0f
                }.lparams(wrapContent, wrapContent) {
                    topMargin = 25
                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                    }
                    onClick {
                        toast("Ini Layout 1")
                    }
                    imageView {
                        imageResource = R.drawable.emt1
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#ffd700")
                        textView {
                            text = "Latihan Anko Layout 1"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                    }
                    onClick {
                        toast("Ini Layout 2")
                    }
                    imageView {
                        imageResource = R.drawable.emt2
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#ffd700")
                        textView {
                            text = "Latihan Anko Layout 2"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                    }
                    onClick {
                        toast("Ini Layout 3")
                    }
                    imageView {
                        imageResource = R.drawable.emt3
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#ffd700")
                        textView {
                            text = "Latihan Anko Layout 3"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
            }
        }
    }
}