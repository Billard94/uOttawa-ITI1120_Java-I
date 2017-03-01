// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

public class A2Q7
{
    public static void main( String[] args )
    {
        // DECLARE VARIABLES
        int choice;     // user’s choice for difficulty level
        int maxGuesses; // the maximum number of wrong guesses
        int secretNum;  // the secret number chosen by the program
        int result;     // the result returned by the guess method 
        
        // Read in the user's choice - check value provided by the user
        System.out.println("Guessing Game");
        System.out.println("Do you want to play a ");
        System.out.println("1. Easy game?");
        System.out.println("2. Difficult game?");
        System.out.println("3. Very difficult game?");
        
        do // loop to validate choice
        {
           System.out.print("Make a choice (1, 2, or 3): ");
           choice = ITI1120.readInt();
           if (choice < 1 || choice > 3)
           {
              System.out.println("Invalid Choice!");
           }          
        }while(choice < 1 || choice > 3);
        
        //Generate the maximum number of guesses allowed according to the user's choice
        if (choice == 1)
        {
          // Generate a random ineteger number between 20 and 30   
          maxGuesses = 20 + (int)(Math.random() * 11);             
        }
        else if (choice == 2)
        {
          // Generate a random integer number between 10 and 15
          maxGuesses = 10 + (int)(Math.random() * 6);
        }
        else
        {
          // Generate a random integer number between 1 and 5
          maxGuesses = 1 + (int)(Math.random() * 5);
        }
        
        System.out.println("You have " + maxGuesses + " guesses to find the secret number");
        
        // Generate a random integer number between 1 and 100 - This is the secret number which the user tries to guess
        secretNum = 1 + (int)(Math.random() * 100);
               
        // Call method to let the user play the game
        result = guess(secretNum, maxGuesses);
               
        // Display the final message
        if (result != -1)
        {
           System.out.println("You WIN in " + result + " guesses – the secret number is " + secretNum + "!");
        }
        else
        {
           System.out.println("GAME OVER - the secret number is " + secretNum + "!");
        }        
        
    }

    /*----------------------------------------------------------------------------------------------------------------*/
    /**
      *  Method: guess
      *  Description: simulates a guessing game by getting from the player guesses and evaluating them. 
      *  Paramters:
      *    secretNum - the number secretly chosen by the program, 
      *    numGuesses - the number of guesses allowed 
      */
    private static int guess(int secretNum, int numGuesses)
    {
        int theRes; //number of guesses used to find the number or -1 if not found
        int guessCnt;  //counter for the number of guesses
        int playerGuess;  //the number guessed by player
       
        // Initialization
        theRes = -1;
        guessCnt = 1;
        
        while ( guessCnt <= numGuesses && theRes == -1)
        {
            // Read in the user's guess - check value
            do // loop to validate guessed number
            {
                System.out.print("Guess " + guessCnt + " of " + numGuesses + ": ");
                playerGuess = ITI1120.readInt();
                
                if (playerGuess < 1 || playerGuess > 100)
                {
                    System.out.println("The number " + playerGuess + " is not valid.");
                }               
            }while(playerGuess < 1 || playerGuess > 100);
            
            //Compare player's guess with secret number
            if (playerGuess > secretNum)
            {
               System.out.println("The guess is too big.");
            }
            else if (playerGuess < secretNum)
            {
               System.out.println("The guess is too small.");
            }
            else
            {
               theRes = guessCnt;
            }
            
            //increment counter
            guessCnt = guessCnt + 1;            
        }                
        
        // Return the result
        return (theRes);
    }
}
