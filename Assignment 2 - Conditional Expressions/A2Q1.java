// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

import java.util.Scanner;
public class A2Q1
  
/*
================================================== 
                    Question 1 
================================================== 
*/
{
   public static boolean isTriangle (int x, int y, int z)
   {
     return (z > x + y || x > y + z || y > x + z); // This will return a false triangle
   }
  
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter three positive integers for the length of a triangle");
    int x=keyboard.nextInt(); // side 1
    int y=keyboard.nextInt(); // side 2
    int z=keyboard.nextInt(); // side 3
    
    boolean result = isTriangle(x, y, z); // Calling the other method
       
     if (result) {
      System.out.println("There is no triangle whose sides have length "+x+", "+y+", and "+z+".");  
    }
     else {
       System.out.println("The three lengths ("+x+", "+y+", "+z+") determine a triangle");
    }
       keyboard.close();
    } 
  }