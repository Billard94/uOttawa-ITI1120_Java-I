import java.util.Scanner;
public class A2Q2
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

/*
================================================== 
                    Question 2
================================================== 
*/
{
   public static boolean is_Safe (int x)
   {
     return (x%9==0 || (x+1)%10==0 || x>90);
   }
  
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int x;
    
      System.out.println("Enter a number between 1 and 99.");
      x=keyboard.nextInt();   
    
    boolean result = is_Safe(x); // calling the other method with the set rules to know if it has 9 as divisor or in it
       
     if (result) {
       System.out.println("This number "+x+" is not a safe number.");  
    }
     else {
       System.out.println("This number "+x+" is a safe number.");
    }
       keyboard.close();
    } 
  }