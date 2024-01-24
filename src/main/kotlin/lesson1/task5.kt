package org.example.lesson1

fun main() {
    val oneMinute = 60
    val oneHour = 3600

    var seconds = 6480
    val hours = seconds / oneHour
    val minutes = seconds / oneMinute - oneMinute * hours

    seconds = seconds - oneHour * hours - oneMinute * minutes

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}