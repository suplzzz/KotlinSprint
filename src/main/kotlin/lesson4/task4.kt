package org.example.lesson4

fun main() {
    val day = 5

    val isElven = day % 2 == 0

    println(
        """
        Упражнения для рук:    ${!isElven}
        Упражнения для ног:    $isElven
        Упражнения для спины:  $isElven
        Упражнения для пресса: ${!isElven}
    """.trimIndent()
    )
}