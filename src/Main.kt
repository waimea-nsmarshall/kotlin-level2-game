/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Pinned
 * Project Author: Nikau Marshall
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

val squares = mutableListOf<String>()
val empty = "----"
val boardSize = 16
var player1Name =  ""
var player2Name = ""
var player1Move = 0
var player1Choice = 0
var player2Move = 0
var player2Choice = 0
val blackCounter = "  ╳   ".red()
val whiteCounter = "  ◯   ".green()
fun main() {
    println("")
    print("  ╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮".green())
    print("    Pinned    ".magenta())
    print("╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮╰╯╭╮".green())
    println("")
    println("")
    println("")
    println("")
    println("")


    while (true) {
        println("Do you wish to view the game instructions?")
        println("[Y]es")
        println("[N]o")
        val choice = readln()
        if (choice == "Y" || choice == "y") {
            gameInstructions()
            break
        } else if (choice == "N" || choice == "n") {
            break
        }
    }

    getPlayerName()
    createSquares()
    setupBoard()
    showSquares()

    while (true) {
        player1Action()
        player2Action()

    }
}



fun createSquares() {
    while (squares.size < boardSize) {
        squares.add(empty)
    }
}

fun setupBoard() {
    repeat(4) {
        while (true) {
            val random = (0..15).random()
            if (squares[random] == empty) {
                squares[random] = whiteCounter
                break
            }
        }
    }
    while (true) {
        val random = (0..15).random()
        if (squares[random] == empty) {
            squares[random] = blackCounter
            break
        }
    }
}


fun getPlayerName() {
    while (true) {
        println("Enter player one's name: ")
        player1Name = readln()
        if (player1Name == "")
            continue
        println("")
        println("Enter player two's name: ")
        player2Name = readln()
        if (player2Name == "")
            continue
        println("")
        break
    }
}

fun showSquares() {
    println("    1       2       3       4       5       6       7       8       9      10      11      12      13       14      15      16")
    println("┬───────".repeat(squares.size) + ("┐"))
    for (square in squares) {
        print("│ $square".padEnd(8))
    }
    println("│")
    print("┴───────".repeat(squares.size) + ("┘"))
    println("")
}

fun player1Action() {

    while (true) {
        println("$player1Name pick a counter: ")
        player1Choice = readln().toInt() - 1
        if (player1Choice >= boardSize) {
            println("Error (Choice is bigger than board)".red())
            continue
        }
        if (squares[player1Choice] == empty) {
            println("Error (square is empty)".red())
            continue
        }
        break
    }
    while (true) {
        print("$player1Name choose where to move your counter: ")
        player1Move = readln().toInt() - 1


        if (player1Move >= player1Choice) {
            println("Error (You can only move left)".red())
            continue
        }

        if (player1Move < 0 || player1Move >= boardSize) {
            println("Error (Choice is outside the board)".red())
            continue
        }

        if (squares[player1Move] != empty) {
            println("Error(Pick an empty square)".red())
            continue
        }

        var nothingBetween = true
        for (i in player1Move until player1Choice) {
            if (squares[i] != empty) {
                println("Error(Cannot skip counters)".red())
                nothingBetween = false
                break
            }

        }
        if (!nothingBetween) continue
        val squareOne = squares[player1Choice]
        val squareTwo = squares[player1Move]

        squares[player1Move] = squareOne
        squares[player1Choice] = squareTwo

        if (player1Move == 0 && squareOne == blackCounter) {
            gameWin1()
            return
        }
        if (squares[0] == whiteCounter) {
            squares[0] = empty
        }
        showSquares()
    }
}


fun player2Action() {

    while (true) {
        println("$player2Name pick a counter: ")
        player2Choice = readln().toInt() - 1

        if (player2Choice < 0 || player2Choice >= boardSize) {
            println("Error (Choice is bigger than board)".red())
            continue
        }
        if (squares[player2Choice] == empty) {
            println("Error (square is empty)".red())
            continue
        }
        break
    }
        while (true) {
            print("$player2Name choose where to move your counter: ")
            player2Move = readln().toInt() - 1

            if (player2Move >= player2Choice) {
                println("Error (You can only move left)".red())
                continue
            }

            if (player2Move < 0 || player2Move >= boardSize) {
                println("Error (Choice is outside the board)".red())
                continue
            }

            if (squares[player2Move] != empty) {
                println("Error(Pick an empty square)".red())
                continue
            }
            var nothingBetween = true
            for (i in player2Move until player2Choice) {
                if (squares[i] != empty) {
                    println("Error(Cannot skip counters)".red())
                    nothingBetween = false
                    break
                }
            }
            if (!nothingBetween) continue


            val squareOne = squares[player2Choice]
            val squareTwo = squares[player2Move]

            squares[player2Move] = squareOne
            squares[player2Choice] = squareTwo

            if (player2Move == 0 && squareOne == blackCounter) {
                gameWin2()
                return
            }
            if (squares[0] == whiteCounter) {
                squares[0] = empty
            }
            showSquares()
        }

    }

fun gameWin1() {
    println("*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x")
    println("")
    println("$player1Name wins the game!!!".green())
    println("")
    println("*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x")
}

fun gameWin2() {
        println("*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x")
        println("")
        println("$player2Name wins the game!!!".green())
        println("")
        println("*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x*x")
    }

fun gameInstructions() {
    println("")
    println("Rules:")
    println("")
    println("    Game Setup")
    println("")
    println("A row of 16 squares, numbered 1 to 16 from left to right ")
    println("")
    println("5 counters (total) are placed randomly on the board - 4  ◯  and 1  ╳  ")
    println("")
    println("Decide who goes first ")
    println("")
    println("    Gameplay")
    println("")
    println("Players take turns - You may not skip your turn ")
    println("")
    println("On your turn you must do exactly one of the following:")
    println("")
    println("   Slide any counter (◯  or ╳) any number of squares to the left, as long as no ")
    println("   other counter is in the way and the destination square is empty, or… ")
    println("")
    println("Remove the counter on square 1 (only if a counter is there) ")
    println("")
    println("     Win Condition ")
    println("")
    println("The player who removes the black counter from square 1 wins ")
    println("")
}

