import java.util.Scanner;
class Exercise4
{
    public static void main (String[] args)
    {
        int numInt;  // given integer
        int result; 
        
        Scanner keyboard = new Scanner( System.in );
        
        System.out.println( "Enter an *INTEGER*:" );
        numInt = keyboard.nextInt();
             
        result = isDivisible23(numInt);
        
        if(result == 1){  //imporant to ask this question first. Why?
          System.out.println( numInt + " is divisible by 2 and by 3." );
        }
        else if(result == 2){  //think of what would happened if this was asked first and the input was the number 4.
          System.out.println( numInt + " is divisible by exactlly one of 2 or 3." ); 
        }
        else if(result == 3){
          System.out.println( numInt + " is not divisible by either 2 or by 3." );
        }
        else{
          System.out.println( "An ERROR has occured." );
        }
    }

    
     private static int isDivisible23 (int num)
     {  
        int result;      
        if(num % 2 == 0 && num % 3 == 0){ //again, important to ask this question first. same reason as above.
          result = 1;
        }
        else if(num % 2 == 0 || num % 3 == 0){
          result = 2;
        }
        else{
          result = 3;
        }
        
        return result;
     }
     
} 
