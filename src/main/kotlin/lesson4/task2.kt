package org.example.lesson4

fun main() {
    val upperLimit = 100
    val lowerLimit = 35
    val acceptableVolume = 100

    val weightFirst = 20
    val volumeFirst = 80

    val weightSecond = 50
    val volumeSecond = 100

    println(
        "Груз с весом $weightFirst кг и объемом $volumeFirst л соответсвутет категории 'Average' : " +
                "${(weightFirst <= upperLimit) and (weightFirst >= lowerLimit) and (volumeFirst < acceptableVolume)}"
    )

    println(
        "Груз с весом $weightSecond кг и объемом $volumeSecond л соответсвутет категории 'Average' : " +
                "${(weightSecond <= upperLimit) and (weightSecond >= lowerLimit) and (volumeSecond < acceptableVolume)}"
    )
}