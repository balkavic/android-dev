package com.bnyevrik.basicclasseswithinheritanceexampe

import android.util.Log

class Shipyard {
    fun serviceShip(shipToBeServiced: Ship) {
        shipToBeServiced.serviceShip()
        Log.i("Servicing", "${shipToBeServiced.name}")
    }
}
