# <b> Final Project: CHESS </b>
Welcome to CHESS by George Zheng and Anne Zhang
## HOW TO PLAY!
1. Get yourself a friend!
2. Get a computer and open terminal :)
3. cd into whichever directory you would like to place the chess game : ex) ``` cd Desktop ```
4. Type in: ```git clone https://github.com/georgezheng123/Final-Project.git```
5. To run the game you first have to compile it! Type in: ```javac Chessboard.java```
6. Then to run the game you will have to type: ```java Chessboard```
7. HAVE FUN PLAYING!

## Development Log
### January 5th, 2018
* Created the class skeletons
### January 12 ,2018
* FINISHED THE GUI WOO
* All the pieces are on the Chessboard
* We realized that we didn't need to use a double array to place the pieces on the chessboard but the each grid on the chessboard could be represented by a number from 0 to 63.
### January 16th, 2018
* Started to work on the movement of the pieces
* King movement works!
* Decided to do movement in the order of: King, Pawn, Rook, Queen, Knight, and Bishop
### January 17th, 2018
* Pawn capture works!
* Queen can move diagonally!
* Started to work on Rook movement
* Also added Knight Movement
* Worked on the collision checks in the Pieces
### January 20th, 2018
* Worked more on pawn capture
* Fixing the pawn movement and rook unit collision
* King is able to check
* Began to work on checkmate and it seems like it works (further testing needed)
* Started to work on the mainMenu class
* BUGS: The button does the change the screen to Chessboard :( 
### January 21th, 2018
* More testing about checkmate
* Working on main menu
