/**
 * This program finds the transpose of a matrix entered by the user.
 * The main method asks for the user to enter a matrix, and then calls
 * transpose() to do the transposition.  The result matrix is then
 * printed.
 */

import java.util.Scanner;

class Transpose
{
    public static void main (String[] args)
    { 
        // SET UP KEYBOARD INPUT
        
        Scanner keyboard = new Scanner( System.in );

        // Get input:

        System.out.println( "Enter the number of rows in matrix A:  " );
        int nRows = keyboard.nextInt( );
        System.out.println( "Enter the number of columns in matrix A:  " );
        int nCols = keyboard.nextInt( );

		  System.out.print("Enter a "+ nRows+" by "+nCols+" matrix row by row: ");
		  int[][] A = new int[nRows][nCols];
        
		  int i, j;
		  
		  for (i = 0; i < nRows; i++){
			  for (j = 0; j < nCols; j++){
				  A[i][j] = keyboard.nextInt();
			  }
		  }
        
        // CALL TO THE TRANSPOSE METHOD
     
	     int[][] AT;     // Declared Transpose of a
        AT = transpose( A ); 

        // PRINT OUT RESULTS AND MODIFIEDS

        System.out.println( );
        System.out.println( "The transposed matrix AT is: " );
        System.out.println( );
       
		  for (i = 0; i < AT.length; i++){
			  for (j = 0; j < AT[0].length; j++){
				  System.out.println( AT[i][j]+" ");
			  }
			  System.out.println();
		  }

    }


    /**
     * This method transposes matrix 'A', returning matrix 'AT'.
     *
     * Matrix a is assumed to be rectangular (as opposed to ragged) 
     *
     */

    public static int[][] transpose( int[][] A)
    {
  
        int nRows = A.length;       // number of rows in A
        int nCols = A[0].length;    // number of columns in A:  this uses the
                                    // assumption that the matrix is a rectangle (and not a rugged matrix)
                                    // so we can can use the length of any row.

        // Create result matrix.  Be careful with dimensions!
        
        int[][] AT = new int[nCols][nRows];

        // Loop through each matrix position in AT:

        for ( int row = 0; row < AT.length; row++ )
        {
            for ( int col = 0; col < AT[row].length; col++ )
            {
                AT[row][col] = A[col][row] ;
            }
        }

        // RETURN RESULT

        return AT;
    }
                    
}
