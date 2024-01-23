package org.example.lesson1

fun main() {
    var seconds = 6480
    val hours = seconds / 3600
    val minutes = seconds / 60 - 60 * hours
    seconds = seconds - 3600 * hours - 60 * minutes

    println(
        "${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${
            seconds.toString().padStart(2, '0')
        }"
    )
}