package com.bnyevrik.whendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Pacific"
        when (name) {
            "Atlantic", "Pacific", "Arctic" ->
                Log.i("Found: ", "$name is an ocean")

            "Thames", "Nile", "Mississippi" ->
                Log.i("Found: ", "$name is a river")

            "Labrador", "Beagle", "Jack Russel" ->
                Log.i("Found: ", "$name is a dog")

            else -> {
                Log.i("Not found: ", "$name is not in database")
            }
        }

        var x = 10

        while (x > 0) {
            Log.i("x=", "$x")
            x--
        }

        var y = 10
        do {
            y++
            Log.i("In the do block and y=", "$y")
        }
        while (y < 10)

        for (i in 1..10)
            Log.i("Looping through list", "Current value is $i")

    }
}
