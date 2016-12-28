// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 5

import java.io.* ; 
import java.util.Scanner; 

class A5Q1
{ 
  public static void main (String args[ ]) 
  { 
    System.out.println("Enter a positive integer:");
    Scanner keyboard = new Scanner( System.in );
    int n = keyboard.nextInt();
    
    System.out.println("The sum of the digits of "+n+" is "+ digitSum(n));
    System.out.println("The digital sum of the digits of "+n +" is "+ digitalRoot(n));
  }
  
  public static int digitSum( int n )
  { 
    int sum;
    if (n==0){ 
      sum = 0;
    }
    else{ 
      sum = n%10 + digitSum(n/10);
    }
    return sum;
  }
  
  public static int digitalRoot( int n )
  { 
    int result;
    int sum;
    
    if ( n < 10 )
    {
      result = n;
    }
    else
    {
      sum = digitSum( n );
      result = digitalRoot( sum );
    }
    return result;
  }
}   