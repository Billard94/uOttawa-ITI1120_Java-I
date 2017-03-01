public class myPrintLibrary{

  
// PUBLIC ... STATIC  

// what happens if we change this to PRIVATE 
  
  public static void printDoubleArray(double[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + "  ");
    System.out.println();
  }
  
   public static void printIntArray(int[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + "  ");
    System.out.println();
  }
  
   public static void printIntMatrix(int[][] B)
  {
     for (int raw = 0; raw < B.length; raw++){ 
      for (int col = 0; col < B[raw].length; col++){ 
        System.out.print(B[raw][col] + "  "); 
      }
       System.out.println();
    }
    
  }
   
   
}