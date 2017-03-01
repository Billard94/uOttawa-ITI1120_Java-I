/* 
================================================== 
question 6
================================================== 
*/ 

// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

import java.io.* ; 
import java.util.Scanner; 
 
class A2Q6 
{ 
   public static void main (String args[ ]) 
   { 
     Scanner keyboard = new Scanner( System.in );
    
     int m;
     System.out.println("Enter an integer (how tall is your tree) ");
     m = keyboard.nextInt();  
     
     draw_tree(m);
   }
   
   public static void draw_tree(int m)
   {    
       int i,j;
       for (i = 1 ;  i <= m; i++)
        {
          for (j = 1 ;  j <= m-i; j++)
            System.out.print(" ");
          for (j = m-i ;  j < m; j++)
            System.out.print("*");  
          for (j = m-i ;  j < m-1; j++)
            System.out.print("*");  
          System.out.println();
        }
       
       for (j = 1 ;  j <= m-1; j++)
            System.out.print(" ");
       System.out.println("*");
       for (j = 1 ;  j <= m-1; j++)
            System.out.print(" ");
       System.out.println("*");
   }   
}   