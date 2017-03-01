
class Exercise1
{
    public static void main (String[] args)
    {
      int i = 10, j = 15, k = 20; 
      double x = 10.0, y = 2.5, z = 100.0; 
      
      boolean result = i < j || j < k && x <= y; 
      System.out.println(result);
      
      result = ( !(j - i < 3) && j %  12 == 3 );
      System.out.println( result);
      
      result = (i / 4) == y ;
      System.out.println( result);

      result=(x / 4) == y; 
      System.out.println( result);
      
      result=!(x != i); 
      System.out.println( result);
      
      result='a' != 'b'-1;
      System.out.println( result);
      
      result= !(!!false || !!true); 
      System.out.println( result);
      
      result = (! (i > 0)) || ((i < j) && (j == 0));
      System.out.println( result);
      
    }
     
} 
