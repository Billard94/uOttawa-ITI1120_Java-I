import java.util.Scanner;

/**
 * This program computes the sum for 1 to n in two ways: Iterative and Recursive.
 * It also computes the product of 1 to n, thus n! in two ways: Iterative and Recursive

 */

class SumProd
{
    public static void main (String[] args)
    {
       // SET UP KEYBOARD INPUT
       Scanner keyboard = new Scanner( System.in );	 
	
	  // get the input	 
     System.out.println( "Enter the number n:" );
     int n = keyboard.nextInt( );
     
	  // print the results of all method calls:     
     System.out.println( "The iterative sum is " + sum(n) );
     System.out.println( "The recursive sum is " + sum_rec(n) );
     System.out.println( "The iterative product is " + prod(n) );
     System.out.println( "The recursive product is " + prod_rec(n) );

    }
    
	 
 // this method computes the sum of integers from 1 to n: 
 // this is ITERATIVE SOLUTION	 
  public static int sum(int n)
  {
   int sum = 0;
   int i;
        
   for (i=1; i <= n; i++)
    {
     sum =  sum + i; 
    }  
   return sum;
  }  
  
  
  // this method also computes the sum of integers from 1 to n: 
  // this is RECURSIVE SOLUTION:
  public static int sum_rec(int n)
  { 
   int sum;
    
   if (n == 1) 
    {  
     sum = 1; 
    }    
   else
    {
     sum =  sum_rec(n-1) + n; 
    }  
   return sum;
  }  
  
  // this method computes the the product 1*2*3*...*n, thus it computes n!: 
  // this is ITERATIVE SOLUTION	
  public static int prod(int n)
  {
   int p = 1;
   int i;
        
   for (i=1; i <= n; i++)
    {
     p =  p * i; 
    }  
   return p;
  }  
  
  
  // this method computes the the product 1*2*3*...*n, thus it computes n!: 
  // this is RECURSIVE SOLUTION	
  public static int prod_rec(int n)
  {
   int p; 
    
   if (n == 1) 
    {  
     p = 1; 
    }    
   else
    {
     p =  prod_rec(n-1) * n; 
    }  
   return p;
  }  
} 
