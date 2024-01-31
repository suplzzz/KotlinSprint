package org.example.lesson5

import kotlin.random.Random

fun main() {
    val listOfNumbers = (1..3).map { (0..42).random() }

    println(
        """
        Вы можете выиграть в лотерее!
        Для этого отгадайте от 1 до 3 чисел загаданных заранее!
    """.trimIndent()
    )

    val listOfInputs = (1..3).map { readln().toInt() }
    val coincidences = (listOfNumbers.intersect(listOfInputs.toSet())).size

    when (coincidences) {
        3 -> println("Все числа угаданы! Джекпот!")
        2 -> println("Угаданы 2 из 3 чисел! Крупный выигрыш!")
        1 -> println("Угадано 1 число из 3! Утешительный приз!")
        0 -> println("Ни одного числа не угадано :(")
    }
    println("Были загаданы: ${listOfNumbers[0]}, ${listOfNumbers[1]} и ${listOfNumbers[2]}")
}