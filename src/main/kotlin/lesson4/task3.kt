package org.example.lesson4

fun main() {
    val condition1: Boolean = true
    val condition2: Boolean = true
    val condition3: Int = 20
    val condition4: String = "зима"

    println(
        "Благоприятные ли сейчас условия для роста бобовых? ${
            condition1 == REQUIREMENT1 &&
                    condition2 == REQUIREMENT2 &&
                    condition3 == REQUIREMENT3 &&
                    condition4 != REQUIREMENT4
        }"
    )
}

const val REQUIREMENT1: Boolean = true
const val REQUIREMENT2: Boolean = true
const val REQUIREMENT3: Int = 20
const val REQUIREMENT4: String = "зима"