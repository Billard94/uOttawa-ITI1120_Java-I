public class Speed{
  public static void main(String args[]) {
  
    final int SIZE=1000000; // size of the array
    int[] numbers=new int[SIZE]; //create the array 
    
    // this fills the array numbers it with random integers in rage [0, 5*SIZE)
    for (int i = 0; i < numbers.length; i++) {
      numbers[i]=(int)(Math.random()*(5*SIZE));
    }
    
    //this generates random key to be serach for, in the range [0, 8*SIZE)
    int element=(int)(Math.random()*(8*SIZE));
    
    // this sorts the array
    java.util.Arrays.sort(numbers);
    
    // Uncoment this when done with that part: 
    //System.out.println("The time spent by binary search is "+ executionTime+" nanoseconds");
    
  }
  
  // a method implementing linear serach algorithm
  public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++)
      if (key == list[i])
      return i;
    return -1;
  }
  
  
   // a method implementing binary serach
   public static int binarySearch(int[] list, int key) {
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
}

