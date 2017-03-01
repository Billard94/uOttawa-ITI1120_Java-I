import java.util.Scanner; //needed for input

class TotalBill
{
    public static void main(String[] args)
    { 
      double subtotal, gratuity_rate; //GIVENS
      double gratuity; //INTERMEDIATE
      double total; //RESULT
      
      
       // READ IN GIVENS
      Scanner keyboard = new Scanner(System.in);      

      System.out.println("Enter a number for a subtotal"); 
      subtotal= keyboard.nextDouble(); 
      
      System.out.println("Enter a number for gratuity percentage");
      gratuity_rate=keyboard.nextDouble(); 
      
      //BODY OF ALGORITHM
      
      gratuity=subtotal*gratuity_rate/100;
      
      total=subtotal+gratuity;
      
      System.out.println("Your total is: " +total);
          
     }
    
}