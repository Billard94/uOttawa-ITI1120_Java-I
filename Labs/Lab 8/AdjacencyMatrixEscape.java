import java.util.Scanner;

public class  AdjacencyMatrixEscape{
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
    
   int[] result;
   result=cheapDirectFlights(cost, home, budget);
    
   if(result==null){
      System.out.print("There are no direct flights that you can afford.");
    }
    else{
      System.out.print("You can afford to fly to directly to ");
      for(int i = 0; i < result.length; i++){
        System.out.print(result[i]+"  ");
      }
    }
   
    
  }
  
 
  public static int[] cheapDirectFlights(int[][] cost, int home, double d)  
 { 
   int n= cost[0].length;
    boolean[] isAffordable = new boolean[n]; // Array that tells us which cities we can afford to go to directly to
    for (int i = 0; i < n; i++)
      isAffordable[i] = false; // initially all initialized to unaffordable
    
    // this loop determines the cities we can afford to go to directly from home  
    for (int col = 0; col < n ; col++ ) 
    { 
      if ( (col != home) && (cost[home][col ] <= d ) ) // note the first condition.  
      { 
        isAffordable[col]=true;
        System.out.print(" "+col);   
      } 
   }  

   // count the number of cities we can afford to go to
    int num_affordable=0;
    for (int i = 0; i < n; i++) {
      if(isAffordable[i]){
       num_affordable++; 
      }
    }
  
   int [] affordable;
   if(num_affordable==0) // if no direct flight is affordable, we return null, i.e. a reference to no array
   {
     affordable=null; 
   }
   else // otherwise we create an array whose size is exactlly the number of destinations we can afford to fly direclty to
   {  
     affordable= new int[num_affordable];
     int k=0;
      for (int i = 0; i < n; i++) {
        if(isAffordable[i]){
          affordable[k]=i;
          k++;
        }
      }
    }
    return(affordable);   // return a referene variable to the array of affordable direct locations
  
  }
  
}