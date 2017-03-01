public class  Exercise5{
  public static void main(String[] args) {
    int count;
    
    count = 10; 
              // since the smallest number you want to print is 1, 
              // the looping should continue for numbers strictly greater than 0 only, 
              //thus count >0, or count >=1 would work
    while (count > 0)  
    { 
      System.out.println(count); 
      count = count - 1; // counting down, so need -1
    }  
  }
}