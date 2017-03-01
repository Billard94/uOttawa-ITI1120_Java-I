public class Lab9PaperEx1a{
  public static void main(String[] args) {     
    xMethod(5);   
  } 
  
  public static void xMethod(int n) { 
    if (n > 0) {       
      System.out.print(n + " ");       
      xMethod(n - 1);     
    } 
  } 
}