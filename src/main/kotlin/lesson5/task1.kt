package org.example.lesson5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()

    val answer = number1 + number2

    println("Для входа в систему решите пример: $number1 + $number2 = ...")

    val input = readln().toInt()

    if (input == answer) println("Добро пожаловать!") else println("Доступ запрещен.")
}