
import java.util.Scanner;

class Average
{ /*
 * This program finds the sum and average of three numbers.
 */
  
  public static void main (String[] args)
  {        
    // SET UP KEYBOARD INPUT 
    Scanner keyboard = new Scanner( System.in );
    
    // DECLARE VARIABLES
    double n1; // number 1
    double n2; // number 2
    double n3; // numer 3        
    double average;  // average of n1, n2, n3
    
    // Read in the given values
    System.out.println( "Enter three numbers" );
    n1 = keyboard.nextDouble( );
    n2 = keyboard.nextDouble( );
    n3 = keyboard.nextDouble( );
    
    // Call method 
    average = computeAverage(n2, n2, n3);
    
    // Diplay the result
    System.out.println( "The average is " + average );
  }
  
  
  // Method: computeSum
  // Descripition: computes the sum and average of the inputted parameters.
  private static double computeAverage(double num1, double num2, double num3)
  {
    // Declaration of intermediate values
    double sum;   // sum of the three numbers
    // Declaration of the result variable 
    double avg;  // average of the three numbers
    
    // BODY 
    sum = num1 + num2 + num3;
    avg = sum / 3.0;
    
    // Return the result
    return(avg);
  }
  
} 
