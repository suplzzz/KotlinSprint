package org.example.lesson2

import kotlin.math.pow

fun main(){
    val deposit = 70_000
    val interestRate = 16.7
    val depositPeriod = 20

    val depositAfterPeriod = deposit * (1 + interestRate * 0.01).pow(depositPeriod)

    println(String.format("%.3f", depositAfterPeriod))

}