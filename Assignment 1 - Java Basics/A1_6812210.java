// Family name, Given name:  Billard, Alexandre
// Student number: 6812210
// Course: ITI 1120 
// Assignment Number: Assignement 1

// Scanner ITI1120.java was used for all the questions, ensure to have ITI1120.java running while running this java file.

public class A1_6812210 
{
  public static void main (String args[]) 
  {
    
 /*
  ================================================== 
                      Question 1 
  ================================================== 
  */ 
  //Declared variables.
  Double fahrenheit;
  Double kelvin;
  
  //The following messages will print to organize the question and make everything clear for the user.
    System.out.println(" ");
    System.out.println("Question 1 - Transfer Fahrenheit into Kelvin.");
    System.out.println("Enter the current temperature in Fahrenheit:");
    
  // Scanner ITI1120.java was entered.
    fahrenheit=ITI1120.readDouble();
  
  // Entered the formula to transform Fahrenheit into Kelvin
    kelvin = (fahrenheit + 459.67) * 5.0 / 9;
  
  // The following message prints out the transformed fahrenheit into kelvins
    System.out.println("The current temperature is " + fahrenheit + " Fahrenheit, that is (approximately) "+ kelvin + " Kelvin.");
 
 /*
  ================================================== 
                      Question 2 
  ================================================== 
  */
  
  // Declared variables.
  int pounds;
  Double ounces;
  Double kilograms;
  
  // The following statement will command the user to enter the correct information
    System.out.println(" ");
    System.out.println("Question 2 - Convert pounds and ounces into kilograms.");
    System.out.println("Enter two numbers for the weight.");
    
    // The scanner ITI1120.java does not understands spaces between numbers, ensure to enter each number to their own individual box
    System.out.println("In the first box, enter pounds only:");
    pounds=ITI1120.readInt();
    System.out.println("In the second box, enter ounces only:");
    ounces=ITI1120.readDouble();
    
    // A typecast was used to create the proper formula.
    // The surplus amount of ounces was pushed into a remainder (%) to properly assess the transformation.
    pounds = ((pounds) + (int)(ounces/16));
    ounces = ounces % 16;
    
    // The formula to transform pounds and ounces and kilograms.
    kilograms = (pounds*16 + ounces) / 35.274;
    
    // The following statement will print out the pounds and ounces into their transformed kilograms.
    System.out.println( pounds + " pounds and "+ ounces + " ounces is (approximately) " + kilograms + " kilograms.");
    
  /* 
   ================================================== 
                       Question 3 
   ================================================== 
   */  
  
  // Declared variables
  String quote;
  String who;
  int year;
  
    System.out.println(" ");
    System.out.println("Question 3 - Formatting a quote.");
    
    // Three scanners were put in, each scanner answers the question asked.
    System.out.println("Give me a quote.");
    quote = ITI1120.readString();
    
    System.out.println("Who said this?");
    who = ITI1120.readString();
    
    // Since the question states a year, the variable integer was used.
    System.out.println("What year did he/she say that (number)?");
    year = ITI1120.readInt();
    
    // The following statements are presented in the order to make the look professionnel.
    System.out.println("======================================================================");
    System.out.println("In " + year + ", a person called " + who + " said: ");
    System.out.println("\"" + quote +"\"");
    System.out.println("**********************************************************************");
    
 /* 
  ================================================== 
                       Question 4
  ================================================== 
*/
 // Declared the variables integers to simplify the result. 
 int number, result;
 
    System.out.println(" ");
    System.out.println("Question 4 - Add the number by itself until 0.");  
    // Assuming the user will enter a positive number as the formula will not understand negative numbers.
    System.out.println("Enter a positive number.");
    number=ITI1120.readInt();
    
    // The formula to find the way to add a number in its own sum. 
    result=number*(number+1)/2;
    
    // This statement prints out the elaborated form the of the sum and its result.
      System.out.println("The result of "+ number + " + " + (number-1) + " + " + (number-2) + " + " + (number-3) + " + [...] is " + result+".");
    
/* 
 ================================================== 
                     Question 5
 ================================================== 
*/
 // Declared the variables as characters because only the 1 character will be used to decorate the house (ASCII drawing)
  char c; //c stands for chimenea
  char w; //w stands for windows
  char d; //d stands for door
  char f; //f stands for fence
  
  // The ASCII drawing is a house and garage
    System.out.println(" ");
    System.out.println("Question 5 - Draw the symbols of your house.");
    
    System.out.println("How would you like your chimenea?");
    c=ITI1120.readChar();
    
    System.out.println("How would you like your windows?");
    w=ITI1120.readChar();
    
    System.out.println("How would you like your door?");
    d=ITI1120.readChar();
    
    System.out.println("How would you like your fence?");
    f=ITI1120.readChar();
    
    System.out.println("                          ..                                 ");
    System.out.println("                         .                                   ");
    System.out.println("                        .                                    ");
    System.out.println("                       []                                    ");
    System.out.println("                       "+c+"                          ");
    System.out.println("                       "+c+"                          ");
    System.out.println("                     /   \\                                    ");
    System.out.println("                    /     \\                                   ");
    System.out.println("                   /       \\                                ");
    System.out.println("                  /         \\                              ");
    System.out.println("                 |___________|                      []          ");
    System.out.println("                 |     ===   |                     /  \\           ");
    System.out.println("                 |     |"+w+"|   |                    /    \\        ");
    System.out.println("                 |     ===   |                   /  |"+w+"| \\         ");
    System.out.println("                 |    ____   |                  |________|         ");
    System.out.println("                 |    | "+d+"|   |                  |________|             ");
    System.out.println("                 |    |."+d+"|   |                  |________|                ");
    System.out.println(""+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+"|    |__|   |"+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+f+"|________|"+f+f+f+f+f+f+f+f);
    System.out.println("-----------------------------------------------------------------");
    
    /* 
 ================================================== 
                     Question 6
 ================================================== 
*/
   // The variables character where for the input character (ch) and the result (lowercase).
    // The variable integer was used as the formula uses a number.
   char ch, lowercase;
   int formula;
   
    System.out.println(" ");
    System.out.println("Question 6 - Print the lowercase.");
    System.out.println("Enter an upper case letter.");
    // The variable ch enables the user to only enter 1 character to be read by the scanner.
    ch=ITI1120.readChar();
    
    // A typecast was used to create the formula.
     formula=32+(int)ch;
    
     // A typecast was once again used to return the value from integer to character for the final result.
     lowercase=(char)formula;
  
     // The statement returns a lowercase character after clarifying which upper case character was entered
     System.out.println("You have entered the upper case letter: '"+ch+"', the lower case letter of '"+ch+"' is: '"+lowercase+"'.");
 
/* 
 ================================================== 
                     Question 7
 ================================================== 
*/
     // Declared the variables accordingly with the question asked on the pdf.
   int y;
   double x, z;
   
    System.out.println(" ");
    System.out.println("Question 7 - Finding the values of y and z when knowing the solution (x).");
   
    System.out.println("Enter a positive number (x).");
    x=ITI1120.readDouble();
    
    // By taking advantage of the variables integer vs double, the y value is easily found by type-casting the x value which is originally a double into and integer.
    y=(int)x;
   
    // The z variable is found by isolating the value.
    z=(x-y)*12;
    
     System.out.println("y = "+y+"; z = "+z);
     System.out.println("The result of x = y + z / 12 is "+x+" = "+y+" + "+z+" / 12.");
    
     /* 
 ================================================== 
                     Question 8
 ================================================== 
*/
   // The variables integer are used for the keyboard input and then formatted further for the median answer.
     // The variables boolean are used to define the right median of the 3 number which can be entered in any format.
    int median1, median2, median3;
    boolean medianfirst, mediansecond, medianthird;
     
    System.out.println(" ");
    System.out.println("Question 8 - Find the median.");
    
    System.out.println("Enter three integers.");
    
    System.out.println("Enter the first integer.");
    median1=ITI1120.readInt();
    
    System.out.println("Enter the second integer.");
    median2=ITI1120.readInt();
    
    System.out.println("Enter the third integer.");
    median3=ITI1120.readInt();
    
    // It seemed more logical to find the boolean that was not the median and work backwards to find the median.
    // The formulas entered looked for the number that was not the median, it looked to satisfy the characteristic of non-medians.
    medianfirst = (median2 < median1 && median3 < median1) || (median2 > median1 && median3 > median1);
    medianfirst = !medianfirst;
   
    mediansecond = (median1 < median2 && median3 < median2) || (median1 > median2 && median3 > median2);
    mediansecond = !mediansecond;
    
    medianthird = (median2 < median3 && median1 < median3) || (median2 > median3 && median1 > median3);
    medianthird = !medianthird;
    
    System.out.println(" " + median1 + " is the median." + " That is " + medianfirst+".");
    
    System.out.println(" " + median2 + " is the median." + " That is " + mediansecond+".");
    
    System.out.println(" " + median3 + " is the median." + " That is " + medianthird+".");
    
/* 
 ================================================== 
                     Question 9
 ================================================== 
*/
    // Coordinate points must be doubles to respect their accuracy.
    double le, lc1, lc2, c1, c2; // le stands for lenght, lc stands for left-corner, and c stands for coordinate
    // Several booleans are used to exact that the coordinate points must be inside or outside the square to verify the right statement.
    boolean bc, bc1, bc2, bc3, bc4, resultcx, resultcy; // bc stands for boolean coordinate, to know if it is inside or oustide the square created
    
    System.out.println(" ");
    System.out.println("Question 9 - Inside or outside the square?");
    
    System.out.println("Enter two numbers for two coordinates of the bottom left corner of the square.");
    System.out.println("Enter the x-coordinate of the bottom left corner of the square.");
    lc1=ITI1120.readDouble();
    System.out.println("Enter the y-coordinate of the bottom left corner of the square.");
    lc2=ITI1120.readDouble();
    
    System.out.println("Enter a positive number for the length of the side of the square.");
    le=ITI1120.readDouble();
    
    System.out.println("Enter two numbers for the coordinates of a query point.");
    System.out.println("Enter the x-coordinate of the query point.");
    c1=ITI1120.readDouble();
    System.out.println("Enter the y-coordinate of the query point.");
    c2=ITI1120.readDouble();
    
    // Once again it seemed more logical to find the wrong booleans to then find the right booleans.
    // Since this is a square, the length would declare its exact location and which points would work inside it.
    // Therefore I created an equation that would find the outside points then declared those booleans as being wrong.
    
    bc1 = c1 <= lc1;
    bc1 = !bc1;
    bc2 = c1 >= (lc1+le);
    bc2 = !bc2;
    resultcx = bc1 && bc2;
    bc3 = c2 <= lc2;
    bc3 = !bc3;
    bc4 = c2 >= (lc2+le);
    bc4 = !bc4;
    resultcy = bc3 && bc4;

    bc = resultcx && resultcy;
    
    System.out.println("The given query point "+"("+c1+", "+c2+")"+" is inside of the square. That is "+bc+".");
        
  /* 
 ================================================== 
                     Question 10
 ================================================== 
*/ 
  // The variables have been declared, all coins are in integers as coins cannot be split
  int q, di, n, p, ra; //q stands for quarters, di stands for dimes, n stands for nickels, p stands for pennies, and ra stands for remaining amount.
  // The entered amount is a double because it is deemed in $ (ex: $1.42)
  Double a; // a stands for amount
  
    System.out.println(" ");
    System.out.println("Question 10 - As few coins as possible.");
    
    System.out.println("Enter the amount of money you are owed in $.");
    a=ITI1120.readDouble();
    
    // Change the double factor into an integer to make into coins.
    // Using the greedy algorithm technique to find the answer.
    
    ra = (int)(a * 100);
    
    // The quarters are divided by 25 (0.25 being their value).
    // The remainder is then sent to dime.
    q = ra / 25;
    ra = ra % 25;
    
    // The dimes are divided by 10 (0.10 being their value).
    // The remainder is then sent to nickel.
    di = ra / 10;
    ra = ra % 10;
    
    // The nickels are divided by 5 (0.5 being their value).
    // The remainder is then sent to penny.
    n = ra / 5;
    ra = ra % 5;
  
    // The remaining amount would be pennies.
    p = ra;
    
    System.out.println("The amount owed will consist of "+(q+di+n+p)+" coins.");
    System.out.println("That being: ");
    System.out.println("        "+q+" quarters");
    System.out.println("        "+di+" dimes");
    System.out.println("        "+n+" nickels");
    System.out.println("        "+p+" pennies");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Family name, Given name:  Billard, Alexandre");
    System.out.println("Student number: 6812210");
    System.out.println("Course: ITI 1120");
    System.out.print("Assignment Number: Assignement 1"+"    ");
      
    }
}