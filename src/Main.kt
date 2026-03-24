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
val boardSize =16

fun main() {
    println("")
    println("   Pinned   ")
    println("")
    //print(gameInstructions())




    createSquares()
    showSquares()
    setupBoard()
    getPlayerName()

}

fun createSquares() {
    while (squares.size < boardSize) {
        squares.add(empty)
    }

}

fun setupBoard() {
    val whiteCounter = "O"
    repeat(4) {
        
    }





    val blackCounter =  "X"


}


fun getPlayerName() {
    var player1Name: String
    var player2Name: String

    println("Enter player one's name: ")
    player1Name = readln()
    println("")
    println("Enter player two's name: ")
    player2Name = readln()
    println("")
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

fun gameInstructions() {
    println("")
    println("Rules:")
    println("")
    println("    Game Setup")
    println("")
    println("A row of 16 squares, numbered 1 to 16 from left to right ")
    println("")
    println("5 counters (total) are placed randomly on the board - 4 () and 1 black  ")
    println("")
    println("Decide who goes first ")
    println("")
    println("    Gameplay")
    println("")
    println("Players take turns - You may not skip your turn ")
    println("")
    println("On your turn you must do exactly one of the following:")
    println("")
    println("   Slide any counter (black or white) any number of squares to the left, as long as no ")
    println("   other counter is in the way and the destination square is empty, or… ")
    println("")
    println("Remove the counter on square 1 (only if a counter is there) ")
    println("")
    println("     Win Condition ")
    println("")
    println("The player who removes the black counter from square 1 wins ")
    println("")
}

