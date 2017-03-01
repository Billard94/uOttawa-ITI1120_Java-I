
public class Exercise7 {
  public static void main(String[] args) {
    // Generate a lottery
    int lottery = 10 + (int)(Math.random() * ((100 - 10) + 1));

    // Prompt the user to enter a guess
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();
    
    // Get digits
    int lottery1 = lottery / 10;
    int lottery2 = lottery % 10;

    int guess1 = guess / 10;
    int guess2 = guess % 10;

    System.out.println("Lottery is " + lottery);
    
    // Check the guess
    if (guess == lottery)
      System.out.println("Exact match: you win $1,000");
    else if (guess2 == lottery1 && guess1 == lottery2) // Do you know why there is no OR (guess1 == lottery1 && guess2 == lottery2)  here?
      System.out.println("Match all digits: you win $300");
    else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 ||  guess2 == lottery2) 
      System.out.println("Match one digit: you win $100");
    else
      System.out.println("Sorry, no match");
  }
}
