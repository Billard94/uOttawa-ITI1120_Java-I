// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 3

import java.util.Scanner;

public class A3Q1 {
 public static void main(String[] args) { 
  
 Scanner keyboard = new Scanner(System.in);
 System.out.println("Enter a positive integer for the size of the array");
 int n = keyboard.nextInt();
 int[] A=new int[n];
 
 System.out.println("Enter " +n+ " numbers separted by space or enter");
 for(int i=0; i<A.length; i++){
  A[i]=keyboard.nextInt();
 }
  
  int result = median(A);
  
  System.out.println(result+" is the median of entered numbers");
  
  
  System.out.println("Sorted list of entered numbers is: ");
  for (int i=0; i < A.length; i++)
  {
   System.out.print(A[i] + " "); 
  }
  System.out.println();
 }
  
 public static int median(int[] arr)
 {
     // First sort the array.
   // Here is a simple sorting algorithm called bubblesort:
    int temp; 
    boolean changed = true; 
        
    // If we go through the array from the beginning to the end and nothing gets swapped 
    // because the order is not correct, then we know that the array is sorted.
    // Thus that is our stopping condition for the loop below, 
    // Boolean variable "changed" in the code below is used for that purpose
    do {
      changed = false; 
      for (int i = 0; i < arr.length - 1; i++){ //understand why we go to < list.length -1
        if (arr[i] > arr[i+1]) {
          //swap neighbours: a[i] with a[i+1]
          temp= arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          changed = true;
        }
      }
    } while (changed);
    
   // now that the array is sorted we can return the median.   
   return arr[ (arr.length - 1)/2];
   
 }    
}
