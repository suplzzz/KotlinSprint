package org.example.lesson3

fun main(){
    val input = "D2-D4;0"

    val output = input.split("-", ";")

    val start = output[0]
    val end = output[1]
    val moveNumber = output[2]

    println(start)
    println(end)
    println(moveNumber)
}