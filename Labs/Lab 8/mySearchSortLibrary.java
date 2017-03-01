public class mySearchSortLibrary{

// PUBLIC ... STATIC  
// what happens if we change this to PRIVATE 
    
  
// linear search in an array of integers

public static int linearSearchInt(int[] list, int key) { 
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }

// linear search in an array of doubles

public static int linearSearchDouble(double[] list, double key) { 
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;
    }
    return -1;
  }



// a method implementing binary serach in a list of integers
   public static int binarySearchInt(int[] list, int key) {
     int low = 0;
     int high = list.length - 1;

     while (high >= low) {
       int mid = (low + high) / 2;
       if (key < list[mid])
         high = mid - 1;
       else if (key == list[mid])
         return mid;
       else
         low = mid + 1;
     }
     
     return - 1;
   }

   
  // a method implementing binary serach in a list of doubles
   public static int binarySearchDouble(double[] list, double key) {
     int low = 0;
     int high = list.length - 1;

     while (high >= low) {
       int mid = (low + high) / 2;
       if (key < list[mid])
         high = mid - 1;
       else if (key == list[mid])
         return mid;
       else
         low = mid + 1;
     }
     
     return - 1;
   } 
   
   
   // selection sort of a list of doubles
   
    static void selectionSort(double[] list) {
    for (int i = list.length - 1; i >= 1; i--) {
      // Find the maximum in the list[0..i]
      double currentMax = list[0];
      int currentMaxIndex = 0;

      for (int j = 1; j <= i; j++) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      // Swap list[i] with list[currentMaxIndex] if necessary;
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
    
}