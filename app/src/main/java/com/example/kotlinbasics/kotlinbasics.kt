package com.example.kotlinbasics

fun main(){

    println("Enter The Age")
    var enteredvalue = readln()
    var age = enteredvalue.toInt()


    if(age>=18){
        println("You Can Enter To The Club")
    }
    else{
        println("You Are Too Young For This")
    }
}