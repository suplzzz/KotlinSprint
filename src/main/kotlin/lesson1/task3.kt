package org.example.lesson1

fun main(){
    val year = "1961"
    var hour = "09"
    var minute = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    //println("$hour:$minute")
    //вывод при помощи string templates

    print(hour)
    print(":")
    print(minute)

}