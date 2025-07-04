package com.example.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln()

    var randomNumber = (1..<3).random()
        if(randomNumber == 1){
            computerChoice = "Rock"
        } else if(randomNumber == 2){
        computerChoice = "Paper"
    } else if(randomNumber == 3){
        computerChoice = "Scissors"
    }
println(computerChoice)

    var winner = when {
        computerChoice == playerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors " -> "Player"
        playerChoice == "Paper" && computerChoice == " Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"

    }

    if(winner=="Tie"){
        println("Its Tie")
    }else if(winner == "player"){
        println("player won")
    }else{
        println("player won")
    }

}
