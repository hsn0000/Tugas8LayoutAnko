package com.example.tugasanko1


import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.TextView
import org.jetbrains.anko.*

class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewSplash().setContentView(this)
        Handler().postDelayed({
            startActivity<LoginActivity>()
            finish()
        }, 5000)
    }

    class ViewSplash : AnkoComponent<SplashActivity> {
        override fun createView(ui: AnkoContext<SplashActivity>) = with(ui){
            verticalLayout {
                lparams{
                    //                    gravity = Gravity.CENTER
//                    centerInParent()
                    width = matchParent
                    height = matchParent
                    verticalGravity = Gravity.CENTER
                }
                verticalLayout {
                    lparams(matchParent, wrapContent) {
                        imageView {
                            imageResource = R.drawable.em1
                        }.lparams(matchParent, 250)
                        textView {
                            text = "Tugas 8 Anko Kotlin"
                            textSize = 20.0f
                            textColor = Color.BLUE
                            topMargin = 25
                            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                        }.lparams(matchParent, wrapContent)
                        textView {
                            text = "M Husin"
                            textSize = 15.0f
                            textColor = Color.BLUE
                            topMargin = 15
                            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                        }.lparams(matchParent, wrapContent)
                    }
                }
            }
        }
    }
}