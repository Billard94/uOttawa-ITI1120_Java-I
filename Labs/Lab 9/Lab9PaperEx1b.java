public class Lab9PaperEx1b{
  public static void main(String[] args) {     
    xMethod(5);   
  } 
  
  public static void xMethod(int n) { 
    if (n > 0) {       
      xMethod(n - 1);  
      System.out.print(n + " ");          
    } 
  } 
}