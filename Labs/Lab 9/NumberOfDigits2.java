import java.util.Scanner;

/**
 * A recursive algorithm for counting the number of digits in a non-negative
 * integer, N.
 */

class NumberOfDigits2
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

		 // in this version we print out each step of recursion for purpose of understanding better the recursion 
    public static int countDigits( int n )
    {
        
        int count;
        int restOfDigits;
        
        // BODY OF ALGORITHM
        
        System.out.println( "1: Entering method with n = " + n );
        
        restOfDigits = n / 10;
        if (restOfDigits == 0)
        {
            System.out.println("5: Base case with n = " + n );
            count = 1;
        }
        else
        {
            System.out.println("2: Recursive call from n =  " + n );
            count = countDigits( restOfDigits );
            System.out.println("3: Returned from recursion with n = " + n );
            count = count + 1;
        }
        
        // RETURN RESULT
        
        System.out.println( "4: Returning from method with n = " + n + " , count = " + count );
        return count;
    }   

} 
