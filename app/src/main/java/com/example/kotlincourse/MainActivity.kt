package com.example.kotlincourse

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    val listener = object : View.OnClickListener {
        override fun onClick(p0: View?) {
        }
    }
    var i: Int = 0

    /**задание 4**/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Hello).setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })

        /** задание 5b**/
        data class Cat(var name: String, var age: Int)

        val cat1 = Cat("Barsik", 4)
        val cat2 = cat1.copy(age = 7)


        /**задание 5с**/
        val Cats = listOf("Murz", "Jerry", "Tom", "Wenny", "Tuna", "Freddy", "Sunny")

        repeat(Cats.size)
        {
            // Log.d("mylogs","$it")
            // Log.d("mylogs","${Cats[it]}")
        }
        for (day in Cats) {
            //Log.d("mylogs","$cat")
        }
        for (i in 0..Cats.size - 1) {
            //Log.d("mylogs", Cats[i])
        }
        for (i in 0 until Cats.size) {
            //Log.d("mylogs", Cats[i])
        }
        for (i in Cats.indices) {
            //  Log.d("mylogs", Cats[i])
        }
        for (i in Cats.size - 1 downTo 0 step 1) {
        }
        Cats.reversed().forEach {
            Log.d("mylogs", "$it")
        }
    }
}