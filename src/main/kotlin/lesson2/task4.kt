package org.example.lesson2

import kotlin.math.round

fun main(){
    val minedCrystals = 7.0
    val minedIron = 11.0

    val buffPercent = 20

    val bonusCrystals = (minedCrystals / 100 * buffPercent)
    val bonusIron = (minedIron / 100 * buffPercent)

    println("Bonus crystals: ${round(bonusCrystals).toInt()}")
    println("Bonus iron: ${round(bonusIron).toInt()}")
}