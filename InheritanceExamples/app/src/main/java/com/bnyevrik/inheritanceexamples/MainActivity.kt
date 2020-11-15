package com.bnyevrik.inheritanceexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class Soldier() {
    open fun shoot () {
        Log.i("Action", "Bang bang bang")
    }
}

class SpecialForces: Soldier() {
    fun sneakUpOnEnemy() {
        Log.i("Action", "Sneaking up on Enemy")
    }
}

class Paratrooper: Soldier() {
    fun jumpOutOfPlane() {
        Log.i("Action", "Jump out of plane")
    }
}

class Sniper: Soldier() {
    var sniperAmmo = 3

    override fun shoot() {
        when (sniperAmmo > 0) {
            true -> {
                Log.i("Action", "Steady... Adjust for wind... Bang.")
                sniperAmmo--
            }
            false -> super.shoot()
        }
    }

    fun getIntoPosition() {
        Log.i("Action", "Preparing line of sight to target")
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soldier = Soldier()
        soldier.shoot()

        val specialForces = SpecialForces()
        specialForces.sneakUpOnEnemy()
        specialForces.shoot()

        val paratrooper = Paratrooper()
        paratrooper.jumpOutOfPlane()
        paratrooper.shoot()

        val sniper = Sniper()
        sniper.getIntoPosition()
        sniper.shoot()
        sniper.shoot()
        sniper.shoot()
        sniper.shoot()
    }
}
