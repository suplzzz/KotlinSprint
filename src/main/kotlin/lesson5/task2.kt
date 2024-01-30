package org.example.lesson5

fun main() {
    val userYear = readln().toInt()
    val currentYear = 2024

    if (currentYear - userYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}

const val AGE_OF_MAJORITY = 18