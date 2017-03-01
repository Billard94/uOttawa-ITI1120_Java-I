import java.util.Scanner;

class ThrowBall
{
    public static void main (String[] args)
    {
        
        Scanner keyboard = new Scanner( System.in );

        // DECLARE VARIABLES

        double v;         // GIVEN:         Initial velocity of ball (m/s)
        double[] range;   // RESULT:        Ranges travelled for various angles (m)
        int theta;        // Horizontal angle of ball (degrees)
        double thetaRad;  // Horizontal angle of ball (radians)
        double degToRad;  // Constant:  degrees to radians multiplier
        double g;         // Constant:  acceleration due to gravity  (m/s^2)
   
        // READ IN GIVENS
     
        System.out.println( "What is the initial velocity of the ball (m/s)?" );
        v = keyboard.nextDouble();
        
        // BODY OF ALGORITHM
     
        g = 9.8;                     // Constant:  gravity acceleration 
        degToRad = Math.PI / 180.0;  // Constant:  degrees -> radians
        
        range = new double[10];
        
        // Note that theta is an int, while thetaRad is a double.  This makes the loop reliable.
        
        theta = 0;
        
        while ( theta <= 90 )
        {
            thetaRad = degToRad * theta;
            range[theta/10] = 2.0 * v * v * Math.cos(thetaRad) * Math.sin(thetaRad) / g;
            theta = theta + 10;
        }
        
 
        // PRINT OUT RESULTS

        theta = 0;
        
        while ( theta <= 90 )
        {
            System.out.println( "For angle " + theta + " degrees, ball travels " + range[theta/10] + " metres." );
            theta = theta + 10;
        }
    }

     
} 
