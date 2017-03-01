import java.util.Scanner;

class ReverseDigits
{ /**
  * This program takes a two digit positive integer and
  * reverses its digits.
  */
  
    public static void main (String[] args)
    {
        // SET UP KEYBOARD INPUT 
        Scanner keyboard = new Scanner( System.in );
        
        // DECLARE VARIABLES/DATA DICTIONARY 
        int aNumber;   // a two digit integer        
        int reversed;  // 'aNumber' with reversed digits
        

        // READ IN GIVENS
        System.out.println( "Enter a two digit integer:" );
        aNumber = keyboard.nextInt();
                
        // Call method 
        reversed = computeRD (aNumber);        
            
        // PRINT OUT RESULTS        
        System.out.println( "The reversed number is " + reversed );
    }

    
    // Method: computeRD
    // Descripition: reverses the inputted number.
    // Given/INPUT: aNumber - a two digit number
    private static int computeRD(int aNumber)
    {
     // Declaration of the result variable 
     int computeRD;
     // Declaration of the intermediate variables
     int high;      // the tens digit of aNumber
     int low;       // the ones digit of aNumber
     
     // BODY
     high = aNumber / 10;
     low = aNumber % 10;
     computeRD = low * 10 + high;
     
     // Return the result
     return(computeRD);
    }
     
} 
