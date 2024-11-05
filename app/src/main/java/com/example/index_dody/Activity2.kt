package com.example.index_dody

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.floor

class Activity2 : AppCompatActivity() {

    private lateinit var textTv: TextView
    private lateinit var imageView: ImageView
    private  lateinit var textView: TextView


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

        val result = intent.getDoubleExtra("key", 0.0)

        textTv = findViewById(R.id.textTv)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)

        when (result) {
            in 0.0..18.5 -> { imageView.setImageResource(R.mipmap.ic_1_foreground);textTv.text = ("     ${result}\n\n Низкий вес" ); textView.text = database().text1 }

            in 18.6..24.9 -> { imageView.setImageResource(R.mipmap.ic_2_foreground);textTv.text = ("     ${result}\n\n Нормальный вес"); textView.text = database().text2 }

            in 25.0..29.9 -> { imageView.setImageResource(R.mipmap.ic_3_foreground);textTv.text = ("     ${result}\n\n Избыточный вес");textView.text = database().text3 }

            else -> { imageView.setImageResource(R.mipmap.ic_4_foreground);textTv.text = ("     ${result}\n\n Ожирение ");textView.text = database().text4 }
            }

                        }

    fun mainActivity(view: View) = startActivity(Intent(this,MainActivity::class.java))
    fun exitProgram(view: View) = finishAffinity()

}