import java.util.Scanner;
public class ex3 {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Initialize the list
    double[] myList = {5.0, 4.4, 1.9, 2.9, 3.4, 3.5};

    // Print the original list
    System.out.println("My list before sort is: ");
    myPrintLibrary.printDoubleArray(myList); // How do we do the call?? Notice the dot operator

    // Sort the list
    mySearchSortLibrary.selectionSort(myList); 


    // Print the sorted list
    System.out.println();
    System.out.println("My list after sort is: ");
    myPrintLibrary.printDoubleArray(myList); 
    
    // Look for an element with linear search
    System.out.println("Enter a real number you want to look for ");
    double key=input.nextDouble();
    int index=mySearchSortLibrary.linearSearchDouble(myList, key);  // How do we do the call?? Notice the dot operator
    if(index<0)
      System.out.println(key+" is not present in the list");
    else
      System.out.println(key+" is present in the list at location "+index);
    
     // Look for an element with binary search
    System.out.println("Enter a real number you want to look for ");
    key=input.nextDouble();
    index=mySearchSortLibrary.binarySearchDouble(myList, key);  // How do we do the call?? Notice the dot operator
    if(index<0)
      System.out.println(key+" is not present in the list");
    else
      System.out.println(key+" is present in the list at location "+index);
    
  }
  
}