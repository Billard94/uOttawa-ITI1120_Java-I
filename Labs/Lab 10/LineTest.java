

/**
 * This class allows the user to enter line segment endpoints, and prints
 * the Line object info, and the length and slope of the line segment.  Then,
 * the user is asked for x and y distances to translate the line segment by.
 * The line segment is translated, and then the line segment info, length, and slope
 * are printed again.
 */

class LineTest
{
    public static void main( String[] args )
    {
        // DECLARE VARIABLES 
        
        double[] lineInput;
        double xs, ys, xe, ye, tx, ty;
		  
        Line aLine;

       
        // BODY OF ALGORITHM
        
        System.out.print( "Enter the x and y coordinates " );
        System.out.print( "of the start of a line segment:  " );

        lineInput = ITI1120.readDoubleLine( );
        xs = lineInput[0];
        ys = lineInput[1];

        System.out.print( "Enter the x and y coordinates " );
        System.out.print( "of the end of the line segment:  " );

        lineInput = ITI1120.readDoubleLine( );
        xe = lineInput[0];
        ye = lineInput[1];

        aLine = new Line();
        aLine.setPoints( xs, ys, xe, ye );
        aLine.printLineInfo( );

        System.out.println( "The length of the line segment is " + aLine.length() );
        System.out.println( "The slope of the line segment is " + aLine.slope() );

        System.out.print( "Enter the x and y distances " );
        System.out.print( "to translate the line segment by:  " );

        lineInput = ITI1120.readDoubleLine( );
        tx = lineInput[0];
        ty = lineInput[1];

        aLine.translate( tx, ty );
        aLine.printLineInfo( );

        System.out.println( "The length of the line segment is " + aLine.length() );
        System.out.println( "The slope of the line segment is " + aLine.slope() );
    }
}
        
        
