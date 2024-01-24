package org.example.lesson2

fun main(){
    val numberOfEmployees = 50
    val numberOfInterns = 30

    val salaryOfEmployees = 30_000
    val salaryOfInterns = 20_000

    val paymentsToEmployees = salaryOfEmployees * numberOfEmployees
    val paymentsToInterns = salaryOfInterns * numberOfInterns
    val allPayments = paymentsToInterns + paymentsToEmployees

    val averageSalary = (allPayments) / (numberOfInterns + numberOfEmployees)

    println(paymentsToEmployees)
    println(allPayments)
    println(averageSalary)
}