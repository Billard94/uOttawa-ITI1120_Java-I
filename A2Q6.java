import java.util.Scanner;
public class A2Q6
// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 2

  
// The code and its print is not properly formatted, ran out of time.
  
/*
================================================== 
                    Question 6
================================================== 
*/
{
   public static int draw_Tree (int m)
   {
     int star1, space1;
     star1 = 42;
     space1 = 32;
     char star, space;
     star = (char)star1;
     space = (char)space1;
 
      for (int i = 2; i <= m; i++){
     System.out.print(space);
    }
       System.out.println();
        System.out.print(space);
      for (int i = 1; i <= (m*2)-3; i++){
     System.out.print(star);
      }
 System.out.println();
       for (int i = 1; i <= (m*2)-1; i++){
     System.out.print(star);
       }
     System.out.println();
     System.out.println(star);
     System.out.println(star);
     return star;
   }
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
   int m, result;
   
   System.out.println("Enter an integer (how tall is your tree)");
   m=keyboard.nextInt();
   
   System.out.println();
   System.out.println("This is your tree:");
   
   result = draw_Tree(m);
   
      keyboard.close();
  }
}