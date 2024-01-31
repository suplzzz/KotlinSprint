package org.example.lesson5

fun main() {
    val number1 = (0..42).random()
    val number2 = (0..42).random()

    println(
        """
        Чтобы выиграть приз отгадайте загаданные числа: 2 числа от 0 до 42.
        Одно число - утешительный приз.
        Оба числа - главный приз.
    """.trimIndent()
    )

    val input1 = readln().toInt()
    val input2 = readln().toInt()

    if ((input1 == number1 || input1 == number2) && (input2 == number1 || input2 == number2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (input1 == number1 || input1 == number2 || input2 == number1 || input2 == number2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }

    println("Были загаданы числа: $number1 и $number2")

}