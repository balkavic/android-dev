package com.bnyevrik.basicclasseswithinheritanceexampe

class Destroyer(name: String): Ship(
    name,
    "Destroyer",
    10,
    200) {

    // No external access whatsoever
    private var shotPower = 60

    override fun attack(): Int {
        // Let the calling code know how much damage to do
        return if (attacksRemaining > 0) {
            attacksRemaining--
            shotPower
        } else {
            0
        }
    }
}