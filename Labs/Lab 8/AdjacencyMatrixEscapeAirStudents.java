import java.util.Scanner;

public class  AdjacencyMatrixEscapeAirStudents{
  public static void main(String[] args) {
    
   Scanner input = new Scanner(System.in);
    
    int[][] cost={
      {0,500, 450, 300, 700}, 
      {500, 0, Integer.MAX_VALUE, 900, Integer.MAX_VALUE}, 
      {450, Integer.MAX_VALUE, 0, 400, Integer.MAX_VALUE},
      {300, 400, 900, 0, 300},
      {700, Integer.MAX_VALUE, Integer.MAX_VALUE, 300, 0}
    };
    
    double budget;
    System.out.println("Enter the maximum amount you can afford to spend on a direct flight ");   
    budget=input.nextDouble();
    
    int home;
    System.out.println("Enter an integer between 0 and 4, for your home city: ");   
    System.out.println("0 for Ottawa, 1 for Singapore, 2 for Paris, 3 for Toronto and 4 for Madrid ");   
    home=input.nextInt();
    
    // HERE IS WHERE YOU SHOULD PLACE A CALL TO your cheapDirectFlights method
   
    
    
    
    // HERE IS where you should print the affordable locations where you can fly directly, 
    // i.e. here is where you print the results that cheapDirectFlights method returns.  
   
   
    
  }
  
  
  // HERE IS WHERE YOUR cheapDirectFlights method starts  
  // Uncomment the following line before compling and replace ? with appropriate input and output
  
  //public static ? cheapDirectFlights(?)  
  { 
  
   // HERE IS WHERE THE BODY OF YOUR METHOD GOES
   
  }
}