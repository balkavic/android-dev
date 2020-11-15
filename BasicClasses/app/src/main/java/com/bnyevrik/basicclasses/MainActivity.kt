package com.bnyevrik.basicclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendlyDestroyer = Destroyer("Invincible")
        val friendlyCarrier = Carrier("Indomitable")

        val enemyDestroyer = Destroyer("Grey Death")
        val enemyCarrier = Carrier("Grey Death")

        val friendlyShipYard = ShipYard()

        // Uh oh!
        friendlyDestroyer.takeDamage(enemyDestroyer.shootShell())
        friendlyDestroyer.takeDamage(enemyCarrier.launchAerialAttack())

        // Fight back
        enemyCarrier.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyCarrier.takeDamage(friendlyDestroyer.shootShell())

        // Take stock of the supplies situation
        Log.d("${friendlyDestroyer.name} ammo = ", "${friendlyDestroyer.ammo}")
        Log.d("${friendlyCarrier.name} ammo = ", "${friendlyCarrier.attacksRemaining}")

        // Dock at the shipyard
        friendlyShipYard.serviceCarrier(friendlyCarrier)
        friendlyShipYard.serviceDestroyer(friendlyDestroyer)

        // Take stock of the supplies situation again
        Log.d("${friendlyDestroyer.name} ammo = ", "${friendlyDestroyer.ammo}")
        Log.d("${friendlyCarrier.name} ammo = ", "${friendlyCarrier.attacksRemaining}")

        enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())
        enemyDestroyer.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())
    }
}
