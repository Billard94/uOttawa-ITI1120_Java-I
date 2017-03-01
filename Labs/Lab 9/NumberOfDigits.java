import java.util.Scanner;

/**
 * A recursive algorithm for counting the number of digits in a non-negative
 * integer, n.
 */

class NumberOfDigits
{
    public static void main (String[] args)
    {
        // SET UP KEYBOARD INPUT
        
        Scanner keyboard = new Scanner( System.in );

  
        // get the input

        System.out.print("Please enter an integer: ");
        int n = keyboard.nextInt( );
        
        // obtain the result
     
        int result = countDigits( n );      

        // print the results

        System.out.println("The integer has " + result + " digits");

    }

  
    /**
     * The method is a recurisve method that computes and returns  
	  * the number of digits in given input non-negative integer.
     *  
     */

    public static int countDigits( int n )
    {        
        int count;
        int restOfDigits;
        
        // BODY OF ALGORITHM
        
        restOfDigits = n / 10;
        if (restOfDigits == 0)
        {
            count = 1;
        }
        else
        {
            count = countDigits( restOfDigits );
            count = count + 1;
        }
        
        // RETURN RESULT
        
        return count;
    }   

} 
