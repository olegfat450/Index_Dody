package com.example.index_dody

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.floor

class MainActivity : AppCompatActivity() {


    private lateinit var toolbarMain: Toolbar
    private lateinit var image: ImageView

    private lateinit var height: EditText
    private lateinit var weight: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolbarMain = findViewById(R.id.toolbarMain)
        setSupportActionBar(toolbarMain)
        title = "       Индекс массы тела"
        toolbarMain.setLogo(R.drawable.mainimage)


        }

    fun onClick(v: View) {

        height = findViewById(R.id.height)
        weight = findViewById(R.id.weight)
          var h1:Double;var w1: Double

       try {  h1 = height.text.toString().toDouble()/100
              w1 = weight.text.toString().toDouble() } catch (_:Exception) {return}

        var index = w1/(h1*h1)
              index = floor(index * 10)/10
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra("key",index)
        startActivity(intent)


       // startActivity(Intent(this,Activity2::class.java))
    }


        }




