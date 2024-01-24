package org.example.lesson2

fun main() {
    val oneHour = 60

    val startHour = 9
    val startMinute = 39

    val travelTime = 457

    val endHour = (travelTime + startMinute) / oneHour + startHour
    val endMinute = travelTime - oneHour * ((travelTime + startMinute) / oneHour) + startMinute


    println(String.format("%02d:%02d", endHour, endMinute))
}