/**
 * PROGRAM: to check to see if a given array is in sorted order.
 */

public class ArraySorted 
{
    public static void main (String[] args)
    { 
     
        // Get the input array from the user:

        System.out.println("Enter a set of integers on one line separated by spaces");
    
        int[] A = ITI1120.readIntLine();
        int n = A.length;

        
        // call the method to determine if the given array is sorted
        boolean result = checkSorted( A, n );      

        // PRINT OUT RESULTS
        if (result)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }


    /**
     * METHOD:  Recursive method 'checkSorted' which checks to see if an
     *          array is in sorted.
     *
     * Input Parameters:  A:  an array of integers
     *                    n:  the length of the array
     */

    public static boolean checkSorted( int[] A, int n )
    {
   // your recursive solutions goes here
       
    }

}
