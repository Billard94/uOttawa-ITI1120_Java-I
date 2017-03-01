class CapitalOrNot
{
  public static void main (String[] args)
  {
    char ch; //GIVEN
    boolean result; // RESULT
    
    // READ IN GIVENS
    
    System.out.println("Enter a character");
    ch=ITI1120.readChar(); 
    
    //Determine if the character is a capital letter
    
    result = (ch>='A') && (ch<='Z');
  
    System.out.println(result);
  }
}