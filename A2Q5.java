import java.util.Scanner;
public class A2Q5
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

/*
================================================== 
                    Question 5
================================================== 
*/
{
   public static int draw_Rectangle (int m)
   {
     int star1, space1;
     star1 = 42;
     space1 = 32;
     char star, space;
     star = (char)star1;
     space = (char)space1;
    for (int i = 1; i <= m; i++){
     System.out.print(star);
    }
     System.out.println();
     System.out.print(star);
       for (int i = 3; i <= m; i++){
     System.out.print(space);
    }
     System.out.println(star);
  
       for (int i = 1; i <= m; i++){
     System.out.print(star);
       }
     System.out.println();
     return star;
   }
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
   int m, result;
   
   System.out.println("Enter an integer greater than 1 for the length:");
   m=keyboard.nextInt();// m is length
   
   System.out.println();
   System.out.println("This is your rectangle:");
   
   result = draw_Rectangle(m);
   
      keyboard.close();
  }
}