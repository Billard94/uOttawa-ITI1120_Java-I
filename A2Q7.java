import java.util.Scanner;
public class A2Q7 {
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2 
  
  // The code is incomplete, ran out of time.
  
  /*
================================================== 
                    Question 7
================================================== 
*/
  public static int guess (int amountofguesses){
    int number = 1 + (int)(Math.random() * ((100 - 1) + 1));
    return number;
  }
  public static void main(String[] args) {
    
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    
    int guess, amountofguesses;
    
    System.out.println("Do you want to play a");
    System.out.println("1.       Easy game?");
    System.out.println("2.       Difficult game?");
    System.out.println("3.       Very Difficult game?");
    System.out.println("Make a choice (1, 2, or 3):");
    do {
    guess = keyboard.nextInt();
    } while (guess < 1 || guess > 3);
    
      if (guess == 1) {
      System.out.println("You have selected to play the easy game, you have 25 guesses to find the secret number.");
      amountofguesses = guess(guess);
      }
      else if (guess == 2) {
      System.out.println("You have selected to play the difficult game, you have 15 guesses to find the secret number.");
      amountofguesses = guess(guess);
      }
       else if (guess == 3) {
      System.out.println("You have selected to play the very difficult game, you have 5 guesses to find the secret number.");
      amountofguesses = guess(guess);
      }
  }
}
