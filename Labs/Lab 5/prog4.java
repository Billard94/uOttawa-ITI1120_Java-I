public class  prog4{
  public static void main(String[] args) {
    
    System.out.println("Enter an integer greater than 2 for the size of the array?");
    int n=ITI1120.readInt(); 
    int[] A=new int[n];  
    int i; 
    
    A[0]=1;
    A[1]=1;
    i=2;
    while(i<n)
    {
      A[i]=A[i-1]+A[i-2];  
      i++;
    }
    
    /* or, the below is the same
    for(i=2; i<n; i++) 
    {
      A[i]=A[i-1]+A[i-2];  
    }*/
  
    // this prints all the elements of the array created above
    for(i=0; i<n; i++) {
      System.out.println("A["+i+"]="+A[i]);  
    }
    
  }
}
