package org.example.lesson2

import kotlin.math.round

fun main(){
    val minedCrystals = 7.0
    val minedIron = 11.0

    val buffPercent = 20
    val unit = 100

    val bonusCrystals = (minedCrystals / unit * buffPercent)
    val bonusIron = (minedIron / unit * buffPercent)

    println("Bonus crystals: ${round(bonusCrystals).toInt()}")
    println("Bonus iron: ${round(bonusIron).toInt()}")
}