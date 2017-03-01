import java.util.Scanner;
public class  Exercise6{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner( System.in );
    System.out.println("Enter a positive interger");
    int num = keyboard.nextInt(); 
    
    int result=sumofSquares(num);
      
    System.out.println("The sum of squares of positive integers in the range [1,"+num+"] is "+result);
  }

  public static int sumofSquares (int n)
  {
    int sum, value; 
    sum=0;            
    value=1;           
    while(value<=n)    
    {
      sum=sum+value*value;   
      value=value+1;   
    } 
    return(sum);
  }
}