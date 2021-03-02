package me.equag.collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 2250.00, 4000.00)

    for (salario in salarios) println(salario)

    println("----------------------------")
    println("Maior salario é: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Salario médio: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter {it > 2500.00}
    println("----------------------------")

    salariosMaiorQue2500.forEach {println(it)}
    println("----------------------------")

    println(salarios.count { it in 2000.0..5000.0 })
    println("----------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("----------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}