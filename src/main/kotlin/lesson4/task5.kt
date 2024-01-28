package org.example.lesson4

fun main() {
    val requirement1 = true
    val lowerRequirement2 = 55
    val upperRequirement2 = 70
    val requirement3 = 50
    val requirement4 = true

    val condition1 = readln().toBoolean()
    val condition2 = readln().toInt()
    val condition3 = readln().toInt()
    val condition4 = readln().toBoolean()

    val readiness =
        ((condition1 == requirement1) and (condition2 in lowerRequirement2..upperRequirement2) and
                (condition3 >= requirement3)) or
                ((condition2 == upperRequirement2) and (condition4 == requirement4) and (condition3 >= requirement3))

    println("Ready to voyage: $readiness")
}