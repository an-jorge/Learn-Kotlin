/*
13 – Reajuste Salarial
Exercício Python 013: Faça um algoritmo que leia o salário de um funcionário e
mostre seu novo salário, com 15% de aumento
 */

fun main(salary: Float, increase: Float) : String {
    return "Salario actual: $salary, com aumento de $increase = ${salary + (salary * increase / 100)}"

}

main(90.000F, 25.0F)