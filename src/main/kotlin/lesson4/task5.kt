package org.example.lesson4

fun main() {
    val condition1 = readln().toBoolean()
    val condition2 = readln().toInt()
    val condition3 = readln().toInt()
    val condition4 = readln().toBoolean()

    val readiness =
        (condition1 == REQUIREMENT1 &&
                condition2 in LOWER_REQUIREMENT2..UPPER_REQUIREMENT2 &&
                condition3 >= REQUIREMENT3) ||
                (condition2 == UPPER_REQUIREMENT2 &&
                        condition4 == REQUIREMENT4 &&
                        condition3 >= REQUIREMENT3)

    println("Ready to voyage: $readiness")
}

const val REQUIREMENT1 = true
const val LOWER_REQUIREMENT2 = 55
const val UPPER_REQUIREMENT2 = 70
const val REQUIREMENT3 = 50
const val REQUIREMENT4 = true