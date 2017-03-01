import java.util.Scanner; //needed for input

// this is how you would put answers to two (or more) questions together, 
// like you are asked in the assignment.
// Here are the asnwers to Excercise 8 and Exercise 9 in one program, called together.java

class together
{
    public static void main(String[] args)
    { 
      /*     
        ==================================================                    
                          Excercise 8
        ==================================================      
       */
      
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
      
       /*     
        ==================================================                    
                          Excercise 9
        ==================================================      
       */

      char ch; //GIVEN
      boolean result; // RESULT
      
      // READ IN GIVENS
      
      System.out.println("Enter a character");
      ch=ITI1120.readChar(); 
      
      //Determine if the character is a capital letter
    
      result = (ch>='A') && (ch<='Z');
      
      System.out.println(result);
       
    }
    
}