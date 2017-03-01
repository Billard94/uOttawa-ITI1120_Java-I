
/**
 * This program checks if n is divisible by m
 */
import java.util.Scanner;
class Exercise3
{
    public static void main (String[] args)
    {
        int n, m;  // two given integers
        
        Scanner keyboard = new Scanner( System.in );
        System.out.println( "Enter 1st integer:" );
        n = keyboard.nextInt( );
        System.out.println( "Enter 2nd integer:" );
        m = keyboard.nextInt( );
             
        boolean result = isDivisible(n, m);
        
        if(result){ 
          System.out.println(n+" is divisble by "+ m);
        }
        else{
          System.out.println(n+" is not divisble by "+ m);
        }
    }

    
     private static boolean isDivisible (int m, int n)
     {  
        return m % n == 0;
     }
     
} 
