import java.util.Scanner;
public class A2Q4
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

/*
================================================== 
                    Question 4
================================================== 
*/
{

   public static double compute_series (double n)
   {
 
     double sum;
     sum = 0;
    for (double i = 1; i <= n; i++){
     sum = sum + Math.pow((1/i), 2);
    }
    return sum;

  }
  public static void main (String[] args)
 
  {
    Scanner keyboard = new Scanner(System.in);
    
   double result, n;
   
   n=keyboard.nextDouble();
  
   result = compute_series(n);
        
   System.out.println(result+" = "+Math.pow(1/n, 2)+" + "+Math.pow(1/(n-1), 2)+" + "+Math.pow(1/(n-2), 2)+" + "+Math.pow(1/(n-3), 2)+" + "+".....");
    
      keyboard.close();
  }
}