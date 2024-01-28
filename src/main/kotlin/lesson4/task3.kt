package org.example.lesson4

fun main() {
    val requirement1: Boolean = true
    val requirement2: Boolean = true
    val requirement3: Int = 20
    val requirement4: String = "зима"

    val condition1: Boolean = true
    val condition2: Boolean = true
    val condition3: Int = 20
    val condition4: String = "зима"

    println(
        "Благоприятные ли сейчас условия для роста бобовых? ${
            (condition1 == requirement1) and
                    (condition2 == requirement2) and (condition3 == requirement3) and (condition4 != requirement4)
        }"
    )
}