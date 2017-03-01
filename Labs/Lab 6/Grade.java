import java.util.Scanner;

public class Grade{
  public static void main(String args[]) {
	  
	 Scanner keyboard = new Scanner(System.in); 
    
	 int number_of_marks;
    
    //obtain number of marks from the user
    System.out.println("Enter the number of grades: ");
    number_of_marks=keyboard.nextInt();
    
    // create arrays to hold marks and out of values
    double[] marks = new double[number_of_marks];
    double[] out_of = new double[number_of_marks];
    
    //obtain marks and out of values for the user
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Enter mark "+(i+1)+" of "+number_of_marks+" and what is it out of, separated by pressing enter");
      marks[i] = keyboard.nextDouble();
      out_of[i] = keyboard.nextDouble();            
    }

    // call the method that converts all the grades to out of 100 
    double[] marks_out_of_100 = normalized_grades(marks, out_of);
    
    //compute final grade
    double final_grade = 0;
    for (int i = 0; i < marks_out_of_100.length; i++) {
     final_grade=final_grade +  marks_out_of_100[i]/marks_out_of_100.length;
    }
    
    //print final grade
    System.out.println("The final grade is "+final_grade);
    
  }
  
  
  //the method that normalizes all the grades to be out of 100
  public static double[] normalized_grades(double[] mar, double[] out) {  
    double[] temp = new double[mar.length];
    for (int i = 0; i < mar.length; i++) {         
      temp[i]=100*mar[i]/out[i];
    }   
    return temp;
  }
}