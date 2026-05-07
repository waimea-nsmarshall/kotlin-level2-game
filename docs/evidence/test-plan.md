# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Input Name - Invalid / Valid
Test to prove that invalid names will be rejected
### Test Data To Use
I will try adding no name into both of the player name functions to prove that it will not accept them.
### Expected Test Result
I expect that the program will keep asking for a valid name until one is entered.

---

## Counter Skipping - Invalid
Test to determine that counters cannot skip over each other
### Test Data To Use
I will try to skip a counter over another one to prove that it will not skip.
### Expected Test Result
I expect that an error message will come up prompting the user to choose another square to place the counter on.

---

## Board Setup - Gameplay
Test to determine that counters will set up automatically without any errors
### Test Data To Use
I will set up the board 3 times and make sure there are no errors.
### Expected Test Result
I expect that all necessary counters will be set up without errors.

---

## Player 1 win - Gameplay
Test to determine that the player1 win code works.
### Test Data To Use
I will trigger the player 1 win line.
### Expected Test Result
I expect that the player 1 win line will run and the game will end.

---

## Player 2 win - Gameplay
Test to determine that the player2 win code works.
### Test Data To Use
I will trigger the player 2 win line.
### Expected Test Result
I expect that the player 2 win line will run and the game will end.

---

## Error Checking
Test to determine that multiple  error checking works
### Test Data To Use
I will trigger the can not move left error message, the out of bounds message, and choose empty square error message.
### Expected Test Result
I expect that all error messages will pop up and prompt the player to redo their move.

---