public class Lab9PaperEx3{ 
  public static void main(String[] args) {     
    xMethod(7254);   
  } 
  
  public static void xMethod(int n) { 
    if (n > 0) {       
      System.out.print(n % 10);       
      xMethod(n / 10);     
    } 
  } 
}