package com.example.kotlincourse

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object{
        val field1 = "STATIC_STRING"
    }

    val listener = object : View.OnClickListener{
        override fun onClick(p0: View?) {
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Hello).setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })
    }
}