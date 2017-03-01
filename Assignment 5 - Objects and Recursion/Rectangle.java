public class Rectangle 
{
  private int x1, y1; // lower left corner
  private int x2, y2; // upper right corner
  private String colour;
  
  public Rectangle(int x1, int y1, int x2, int y2, String colour) 
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.colour = colour;
  }
  
  public int getX1() {
    return x1;
  }
  public int getY1() {
    return y1;
  }
  public int getX2() {
    return x2;
  }
  public int getY2() {
    return y2;
  }
  
  public void setColour(String newColour) {
    colour = newColour;
  }

  public String getColour() {
    return colour;
  }

  public void move(int x1, int y1) {
    this.x2 = this.x2 + x1 - this.x1;
    this.y2 = this.y2 + y1 - this.y1;
    this.x1 = x1;
    this.y1 = y1;   
  }
  
  public void print()
  {
    System.out.println("The coordinates are (" + x1 + "," + y1 + ") (" + x2 + "," +y2+ ")");
    System.out.println("The colour is " + colour);
  }
  
  public int getPerimeter() {
    return 2*(x2-x1 + y2-y1);
  }
  
  public int getArea() {
    return (x2-x1)*(y2-y1);
  }
  
 public boolean contains(int x, int y) {    
    return (x1  <= x) && (x <= x2) &&
      (y1 <= y) && (y <= y2); 
  }
}
