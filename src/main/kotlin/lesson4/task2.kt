package org.example.lesson4

fun main() {
    val weightFirst = 20
    val volumeFirst = 80

    val weightSecond = 50
    val volumeSecond = 100

    println(
        "Груз с весом $weightFirst кг и объемом $volumeFirst л соответсвутет категории 'Average' : " +
                "${weightFirst <= UPPER_LIMIT && weightFirst >= LOWER_LIMIT && volumeFirst < ACCEPTABLE_VOLUME}"
    )

    println(
        "Груз с весом $weightSecond кг и объемом $volumeSecond л соответсвутет категории 'Average' : " +
                "${weightSecond <= UPPER_LIMIT && weightSecond >= LOWER_LIMIT && volumeSecond < ACCEPTABLE_VOLUME}"
    )
}

const val UPPER_LIMIT = 100
const val LOWER_LIMIT = 35
const val ACCEPTABLE_VOLUME = 100