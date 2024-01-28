package org.example.lesson4

fun main() {
    val totalSeats = 13
    val todayReservation = 13
    val tomorrowReservation = 9

    println("Доступность столиков на сегодня: ${todayReservation < totalSeats}\n" +
            "Доступность столиков на завтра: ${tomorrowReservation < totalSeats}")
}