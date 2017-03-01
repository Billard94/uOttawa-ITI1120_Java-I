public class prog3 {
 
	public static boolean isPerfect(int n){
      int sum = 0;
      for (int divisor = 1; divisor < n ; divisor++) {
        if (n % divisor == 0) { 
          sum = sum + divisor; 
        }
      }
     
      if (n == sum) {
			return true;
      }
		else{
			return false;
		}
		
	}
 
  public static void main(String[] args) {
    for (int number = 6; number <= 10000; number++) {
      if (isPerfect( number) ) {
        System.out.println(number);
      }
    }
  }
}