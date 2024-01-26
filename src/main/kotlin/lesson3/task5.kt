package org.example.lesson3

fun main(){
    val input = "D2-D4;0"

    val start = input.substring(0, 2)
    val end = input.substring(3,5)
    val moveNumber = input.substring(6)

    println(start)
    println(end)
    println(moveNumber)
}