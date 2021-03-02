package me.equag.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.00, 1250.00, 5000.00)
    salarios2.sort()
    salarios2.forEach { println(it) }

}