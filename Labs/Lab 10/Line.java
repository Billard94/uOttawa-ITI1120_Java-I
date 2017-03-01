
/**
 * This class represents a line segment, and is stored as a
 * pair of (x,y) endpoints.
 * <p>
 * Operations on line segments include setting the end points, 
 * determining the length of the line segment, translating the line segment, 
 * printing line segment information, and
 * determining the slope of the line segment.
 */

public class Line
{
	
	// INSTANCE VARIABLES:

	/**
	 * The coordinates of the first endpoint
	 */
	private double xStart;
	private double yStart;

	/**
	 * The coordinates of the second endpoint
	 */
	private double xEnd;
	private double yEnd;


	// CONSTRUCTOR(S):

	// (none)

	// INSTANCE METHODS:

	/**
	 * Sets the end points of the line segment to the given values.
	 */

	public void setPoints( double xs, double ys, double xe, double ye )
	{
		this.xStart = xs;
		this.yStart = ys;
		this.xEnd = xe;
		this.yEnd = ye;
	}

	/**
	 * Returns the length of the line segment.
	 * 
	 */
	public double length( )
	{
		// The usual Pythagorean length formula

		return Math.sqrt( Math.pow( this.xEnd - this.xStart, 2 )
				+ Math.pow( this.yEnd - this.yStart, 2 ) );
	}

	/**
	 * "Slide" the line segment by moving it distance tx in the x direction and ty in
	 * the y direction.
	 * 
	 * Note that tx or ty could be positive, negative, or zero.
	 * 
	 */
	public void translate( double tx, double ty )
	{
		// Move x coordinates of start and end points

		this.xStart = this.xStart + tx;
		this.xEnd = this.xEnd + tx;

		// Move y coordinates of start and end points

		this.yStart = this.yStart + ty;
		this.yEnd = this.yEnd + ty;
	}

	/**
	 * Find the slope of the line.
	 * <p>
	 * This implementation is overly particular about vertical lines and their
	 * "direction".
	 * 
	 * This method returns a slope of the line, or negative or positive infinity as a
	 *         double value.
	 */
	public double slope( )
	{
		double result;

		if ( this.xEnd - this.xStart == 0.0 )
		{
			// The following avoids the actual division by 0
			// although apparently it doesn't much matter.

			if ( this.yEnd - this.yStart >= 0.0 )
			{
				result = Double.POSITIVE_INFINITY;
			}
			else
			{
				result = Double.NEGATIVE_INFINITY;
			}
		}
		else
		{
			result = ( this.yEnd - this.yStart ) / ( this.xEnd - this.xStart );
		}
		return result;
	}

	/**
	 * Display information about the line segment on the screen.
	 */
	public void printLineInfo( )
	{
		System.out.print( "Line from (" + this.xStart );
		System.out.print( " , " + this.yStart + ") to (" );
		System.out.println( this.xEnd + ", " + this.yEnd + ")" );
	}
}
