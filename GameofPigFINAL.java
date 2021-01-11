/**
 * Authors: Shadman Ahmed, Alan Piroti
 * Date: 5/21/18 
 * Filename: GameofPigFINAL
 * Description: This code allows two players to play the game of pig
 **/

//tool library imports that are used by the main class 
import java.util.Scanner; //for scanning user keystroke
import java.util.Random; //for random number generator


class GameofPigFINAL {
  //this is the class of the game which includes the main class
 public static void main(String[] args) {
//this is the main class containing the game

 //these are the variables ints are initialized to 0
   char p1; //player1 character input
  char p2;  //player2 character input
  int score1 = 0;  //player1's round score
  int score2 = 0;  //player2's round score
  int tot1 = 0;  //player1's total score
  int tot2 = 0;  //player2's total score
  int random1 = 0;  //player1's die roll value
  int random2 = 0;  //player1's die roll

  Scanner input = new Scanner(System.in);  //scanner that takes input from the keyboard

  
  //welcome message to the game and the rules:
  System.out.println("WELCOME TO THE GAME OF PIG!");
  System.out.println("Rules: \nEach player will take turns rolling a die, and the score is based on the sum of the numbers you roll from 2 to 6.");
   System.out.println("If you choose to end your turn the points of that round will be held and safe for the next round.");
  System.out.println(" If you roll a 1, the points you received from this round are lost. ");
   System.out.println(" The first player to 50 points wins the game!\n ");
 //while loop for the entire game
  while (true) { //this while loop is always true
   System.out.println("Player 1:(" + score1 + " ," + tot1 + ")Rolling? (y/n)"); //asks player 1 if they want to roll the die, can be yes (y) or no (n).
   p1 = input.next().charAt(0); //takes character input into p1

   if (p1 == 'y') { //if statement checks if the player wants to roll
    random1 = (int)(6 * Math.random() + 1); //number generator for a random number between 1 and 6, ie like a die
    score1 = score1 + random1; //adds round score and the random generated number

    System.out.println("Player 1 rolled " + random1); //states what the player rolled


    if (tot1 + score1 >= 50) { //checks if player is above 50 points
     System.out.println("Player 1 wins, Congratulations!"); //prints win message 
     System.exit(0); //exits application
     break;
    }
   }

   if (random1 == 1) { //checks if number rolled was 1
    System.out.println("Player 1 loses " + score1 + " points, but keeps " + tot1); //prints out player's lost score for this round and number of points kept safe
    score1 = 0;  //score set back to 0
    tot1 = (tot1 + score1); //score points become 0 and total is calculated 

    while (true) {
     System.out.println("Player 2:(" + score2 + " ," + tot2 + ") Rolling? (y/n)"); //asks player 2 if they want to roll the die, can be yes (y) or no (n).
     p2 = input.next().charAt(0); //takes character input into p2

     if (p2 == 'y') { //if statement checks if the player wants to roll
      random2 = (int)(6 * Math.random() + 1); //number generator for a random number between 1 and 6, ie like a die
      score2 = score2 + random2;// calculates round score 
      System.out.println("Player 2 rolled " + random2); //states what the player rolled
      if (tot2 + score2 >= 50) { //checks if player is above 50 points
       System.out.println("Player 2 wins, Congratulations!");  //prints win message
       System.exit(0); //exits application
       break;
      }
     }

     if (random2 == 1) { //checks if number rolled was 1
      System.out.println("Player 2 loses " + score2 + " points, but keeps " + tot2); //prints out player's lost score for this round and number of points kept safe
      score2 = 0; //sets score back to 0
      tot2 = (tot2 + score2); //score points become 0 and total is calculated 
      break;
     } else if (p2 == 'n') { //if statement checks if the player wants to hold their oints and end their turn
      tot2 = (tot2 + score2);// calculates total score 
      System.out.println("Player 2 keeps " + tot2); //states player's total score
      score2 = 0; //score set back to 0
      break;
     }
    }
   }

   if (p1 == 'n') { //if statement checks if the player wants to hold their oints and end their turn
    tot1 = (tot1 + score1);// calculates total score 
    System.out.println("Player 1 keeps " + tot1); //states player's total score
    score1 = 0; //sets score back to 0

    while (true) {
     System.out.println("Player 2:(" + score2 + " ," + tot2 + ") Rolling? (y/n)"); //asks player 2 if they want to roll the die, can be yes (y) or no (n).
     p2 = input.next().charAt(0); //takes character input into p2

     if (p2 == 'y') { //if statement checks if the player wants to roll
      random2 = (int)(6 * Math.random() + 1); //number generator for a random number between 1 and 6, ie like a die
      score2 = score2 + random2;// calculates round score 
      System.out.println("Player 2 rolled " + random2); //states what the player rolled
      if (tot2 + score2 >= 50) { //checks if player is above 50 points
       System.out.println("Player 2 wins, Congratulations!"); //prints win message
       System.exit(0); //exits application
       break;
      }
     }

     if (random2 == 1) {//checks if number rolled was 1
      System.out.println("Player 2 loses " + score2 + " points, but keeps " + tot2); //prints out player's lost score for this round and number of points kept safe
      score2 = 0; //sets score back to 0
      tot2 = (tot2 + score2); //score points become 0 and total is calculated 
      break;
     } else if (p2 == 'n') { //if statement checks if the player wants to hold their oints and end their turn
      tot2 = (tot2 + score2);  // calculates total score 
      System.out.println("Player 2 keeps " + tot2); //states player's total score
      score2 = 0; //sets score back to 0
      break;
     }
    }
   }
  }
 }
}