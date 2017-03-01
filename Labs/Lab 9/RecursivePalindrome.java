public class RecursivePalindrome {
  public static void main(String[] args) {
    boolean result;
    
    result = isPalindrome("moon");
    System.out.println("Is moon a palindrome? "  + result);
    
    
    result = isPalindrome("noon");
    System.out.println("Is noon a palindrome? "  + result);
    
    result = isPalindrome("a");
    System.out.println("Is a a palindrome? " + result);
    
    result = isPalindrome("ab");
    System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
  }
  
  
  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) // Base case
      return true;
    else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
      return false;
    else
      return isPalindrome(s.substring(1, s.length() - 1));   
  }

  
}