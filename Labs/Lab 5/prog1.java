import java.util.Scanner;
public class  prog1{
  public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in); 
    int num1, num2; 
    char choice; 
    
    do{  
      System.out.println("Enter two integers you want to sum up and pressing enter"); 
      
      num1 = keyboard.nextInt(); 
      num2 = keyboard.nextInt(); 
      
      System.out.println("The sum of "+num1+" and "+num2+" is "+ (num1 +num2)); 
      System.out.println("Do you want to try again? Press N for NO. Press any other character for YES"); 
      choice = ITI1120.readChar(); 
    }while (choice != 'N');
  
  }
}