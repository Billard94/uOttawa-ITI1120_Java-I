import java.util.Scanner; //needed for input

class OddOrNot
{
  public static void main (String[] args)
  {
    int number; //GIVEN
    boolean answer; // RESULT
    
    // READ IN GIVENS
    
    Scanner keyboard = new Scanner(System.in);      

    System.out.println("Enter an integer");
    number=keyboard.nextInt();
    
    //DETERMINE IF THE NUMER IS ODD
    
    answer = (number % 2) != 0;  
  
    //DISPAY THE RESULT  
    System.out.println(answer);
  }
}