
import java.util.Scanner;

class ConvertFtoC
{ /**
  * This program converts a temperature from degrees Fahrenheit to degrees Celsuis.
  */
 
    public static void main (String[] args)
    {
        // SET UP KEYBOARD INPUT 
        Scanner keyboard = new Scanner( System.in );
        
        // DECLARE VARIABLES
        double f; // temperature in degrees Fahrenheit        
        double c;  // temperature in degrees Celsius

        // Read in the given values
     
        System.out.println( "Enter a temperature in degrees Fahrenheit:" );
        f = keyboard.nextDouble( );
                
        // Call method 
        c = calculateCelsuis (f);
            
        // Diplay the result
        System.out.println( "The temperature in degrees Celsius is " + c );

    }


    // Method: calculateCelsuis
    // Description: converts the givem degree in Fahrenheit to Celsuis.
    // Givens/Input: f - temperature in Farenheit
    private static double calculateCelsuis(double f)
    {
     // Declaration of the result variable 
     double celsuis;
     
     // BODY 
     celsuis = ( f - 32.0 ) * 5.0 / 9.0;
     
    // Return the result
     return(celsuis);
    }
     
} 