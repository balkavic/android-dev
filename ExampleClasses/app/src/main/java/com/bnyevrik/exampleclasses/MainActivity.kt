package com.bnyevrik.exampleclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Soldier {

    var name = "Ryan"
    var rank = "Private"
    var missing = true

    var bullets = 100
    get() {
        Log.i("Getter being used", "Value = $field")
        return field
    }
    set(value) {
        field = if (value < 0) 0 else value
        Log.i("Setter being used", "New value = $field")
    }

    var packWeight = 150
    val gunWeight = 30
    var totalWeight = packWeight + gunWeight
    get() = packWeight + gunWeight

    fun getStatus() {
        var status = "$rank $name"
        if (missing) {
            status = "$status is missing!"
        } else {
            status = "$status ready for duty."
        }

        // Print out the status
        Log.i("Status", status)
    }
}

class Message

class PartlicleSystem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soldier = Soldier()

//        Log.i("Name =", "${soldier.name}")
//        Log.i("Rank =", "${soldier.rank}")
//        Log.i("Missing =", "${soldier.missing}")

        soldier.getStatus()

        soldier.missing = false
//
        soldier.rank = "Private First Class"
//
        soldier.getStatus()
//        Log.i("Name =", "${soldier.name}")
//        Log.i("Rank =", "${soldier.rank}")
//        Log.i("Missing =", "${soldier.missing}")

        Log.i("bullets = ", "${soldier.bullets}")

        soldier.bullets--

        Log.i("bullets = ", "${soldier.bullets}")

        Log.i("totalWeight =", "${soldier.totalWeight}")

        soldier.packWeight = 300

        Log.i("totalWeight =", "${soldier.totalWeight}")

        val message = Message()
        val particleSystem = PartlicleSystem()
    }
}
