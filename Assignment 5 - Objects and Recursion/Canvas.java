class Canvas
{
    /**
     * Collection of Rectangles.
     */
    private Rectangle[] rectangles;
    
    /**
     * The current number of rectangles stored in the array.
     */
    private int numRectangles;
    
    /**
     * This method initializes the array by allocating space for a specified number of rectangles.
     * 
     * This creates an array of the requested size. However, no objects/rectangles are
     * actually stored in the array, so each entry is null.
     * 
     * @param size
     *     The maximum number of rectangles that can be stored in the array
     *            
     */
    public Canvas(int size )
    {
        // Create array of requested size.
        rectangles = new Rectangle[size];
        // So far, no objects have been stored in the array.
        numRectangles = 0;
    }
    
    /**
     * Adds a rectangle to a Canvas.
     * <p>
     * If the array is full, a message is printed.
     * 
     * @param aRectangle
     *        The rectangle to add
     */
    public void add( Rectangle aRectangle )
    {
        // Check if the array is full       
        if ( numRectangles < rectangles.length )
        {
            // There is space remaining so add given rectangle to the Canvas        
            rectangles[numRectangles] = aRectangle;
            numRectangles = numRectangles + 1;
        }
        else
        {
            // There is no space left.
            System.out.print( "The canvas is full. " );
            System.out.println( "Unable to add a new rectangle." );
        }
    }
    
    public int getNumRectangles()
    {
      return numRectangles;
    }
    
    public void printAll()
    { 
      System.out.println("The rectangles on the canvas are: ");
      for (int i = 0; i < numRectangles; i++)
      {
        rectangles[i].print();
      }
    }
     
    public int countRectanglesForColour(String colour)
    { int count = 0;
      for (int i = 0; i < numRectangles; i++)
      {
        if (colour.equals(rectangles[i].getColour())) 
          count ++;
      }
      return count;
    }
    
    public int totalPerimeter()
    {
      int p = 0;
      
      for (int i = 0; i < numRectangles; i++)
      {
        p = p + rectangles[i].getPerimeter();
      }
      return p;
    }
 
    public static boolean intersect2(Rectangle r1, Rectangle r2)
    {  // If one rectangle is on left side of the other
      if (r1.getX2() < r2.getX1() || r2.getX2() < r1.getX1()){
         return false;
      }
 
      // If one rectangle is above the other
      if (r1.getY2() < r2.getY1() || r2.getY2() < r1.getY1()){
         return false;
      }
 
      return true;
    }

    // check is any pair of rectangles intersect
    public boolean intersectAll()
    { boolean result = true;
      
      for (int i = 0; i < numRectangles-1 && result; i++){
        for (int j = i+1 ; j < numRectangles && result; j++){
          if (! intersect2(rectangles[i], rectangles[j])){
            result = false;
          }
        }
      }
      
      return result;
    }
    
    public Rectangle minEnclosingRectangle()
    { 
       int [] minX = new int[numRectangles];
       int [] maxX = new int[numRectangles];
       int [] minY = new int[numRectangles];
       int [] maxY = new int[numRectangles];
       
       for (int i = 0; i < numRectangles; i++)
       {
        minX[i] = rectangles[i].getX1();
        maxX[i] = rectangles[i].getX2();
        minY[i] = rectangles[i].getY1(); 
        maxY[i] = rectangles[i].getY2(); 
       }
     
      int x1 = min(minX);
      int x2 = max(maxX);
      int y1 = min(minY);
      int y2 = max(maxY);
               
      Rectangle r = new Rectangle(x1,y1,x2,y2,"red");
      return r;
    }
   
    private static int max( int [] a)
    {
       int max = Integer.MIN_VALUE;    
       for (int index = 0; index < a.length; index++)
       { 
         if (a[index] > max)
            max = a[index];  // update max
       }
      return max;
    }
    
     private static int min( int [] a)
    {
       int min = Integer.MAX_VALUE;    
       for (int index = 0; index < a.length; index++)
          if (a[index] < min)
            min = a[index];  // update min
      return min;
    }
}