
import java.util.Scanner;

/**
 * This program computes the (euclidean) distance between two points
 * in the plane.
 */

class LineLength
{
    public static void main (String[] args)
    {   
        // SET UP KEYBOARD INPUT 
        Scanner keyboard = new Scanner( System.in );
        
        // DECLARE VARIABLES/DATA DICTIONARY 

        double xa;      // X coordinate of point A
        double ya;      // Y coordinate of point A
        double xb;      // X coordinate of point B
        double yb;      // Y coordinate of point B
        
        double length;  // distance between the two points
        
        // READ IN GIVENS
     
        System.out.println( "Enter the X coordinate of point A:" );
        xa = keyboard.nextDouble( );
                
        System.out.println( "Enter the Y coordinate of point A:" );
        ya = keyboard.nextDouble( );
                
        System.out.println( "Enter the X coordinate of point B:" );
        xb = keyboard.nextDouble( );
                
        System.out.println( "Enter the Y coordinate of point B:" );
        yb = keyboard.nextDouble( );
                
        // Call method 
        length = computeDistance(xa, ya, xb, yb);   
       
        // PRINT OUT RESULTS        
        System.out.println( "The distance between points A and B is " + length );

    }

    // Method: computeLength
    // Descripition: Computes the distance between two points.
    // Givens/Input:  xa, ya   - coordinates of the first point
    //                xb, yb   - coordintates of the second poing
    private static double computeDistance(double xa, double ya, double xb, double yb)
    {
     
     double distance;  // distance
     
     // BODY
     distance = Math.sqrt( Math.pow( xa - xb, 2) + Math.pow( ya - yb, 2 ) );
     
     // Return the result
     return(distance);
    }
     
} 
