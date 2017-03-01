import java.util.Scanner;
class prog2
{
 public static void main(String[] args)
 {
	Scanner keyboard = new Scanner(System.in); 
   int length, width;
   
   System.out.println("Please enter the length of the rectangle");
   do
   {
     System.out.println("Please enter a value larger than 0 and less than 15: ");
     length = keyboard.nextInt();
   }while (length < 0 || length > 15);
   
   System.out.println("Width of the rectange ");
   do
   {
     System.out.println("Please enter a value larger than 0 and less than 15: ");
     width = keyboard.nextInt();
   }while (width < 0 || width > 15);
   
   printRectangle(length, width);

 }
 
 public static void printRectangle (int length, double width)
 {
   for (int i = 0; i < length; i++)
   {
     for (int j = 0; j < width; j++){
       System.out.print("*");
     }
     System.out.println();
   }
 }
}