package com.example.rockpaperscissors

fun main() {

    println("Enter 1st Number : ")
    val num1s = readln()
    val num1I = num1s.toInt()

    println("Enter 2nd Number : ")
    val num2s = readln()
    val num2I = num2s.toInt()

    val result = divide(5, 2)
    println("The result is $result" )
}

    fun divide( num1 : Int, num2 : Int ) : Int{
        val result = num1/num2
        return result
    }




