import java.util.Scanner;
public class A2Q3
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

/*
================================================== 
                    Question 3
================================================== 
*/
{
   public static boolean test_needed (int x, int y)
   {
     return (((x%1==0 && y%2==0) ||(x%2==0 && y%1==0)) || (((y-x)<3) || ((y-x)>20)));
   }
  
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int x, y;

      System.out.println("Enter the model year.");
      x=keyboard.nextInt(); //model year

      System.out.println("Enter the current year.");
      y=keyboard.nextInt(); //current year
    
    boolean result = test_needed(x,y); // calling the method testing if an emission test is needed or not
       
     if (result) {
       System.out.println("An emission test is needed.");  
    }
     else {
       System.out.println("An emission test is not needed.");
    }
       keyboard.close();
    } 
  }