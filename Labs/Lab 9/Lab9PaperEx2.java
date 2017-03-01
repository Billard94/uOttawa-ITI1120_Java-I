public class Lab9PaperEx2 {
  public static void main(String[] args){
    int result = xMethod(4);
    System.out.println("xMethod returned " + result);
    
  }

  public static int xMethod(int n) { 
    if (n == 1)
      return 1; 
    else
      return n + xMethod(n - 1); 
  }
}