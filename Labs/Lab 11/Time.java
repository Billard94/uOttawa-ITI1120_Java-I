
public class Time
{
	/**
	 * The time's hour value.
	 * <p>
	 * An <code>int</code> value between 0 and 23;
	 */
	private int hour;

	/**
	 * The time's hour value.
	 * <p>
	 * An <code>int</code> value between 0 and 59;
	 */
	private int minute;

	/**
	 * Sets the time to the specified hour and minute values.
	 * <p>
	 * The minute value should be between 0 and 59. If the value is 60 or
	 * larger, the minutes are taken mod 60, and the hour value is adjusted
	 * accordingly. For example, 76 minutes becomes 16 minutes, and 1 hour is
	 * added.
	 * <p>
	 * After adjusting the minute value, the hour value is taken mod 24, so that
	 * the hour is between 0 and 23.
	 * 
	 * @param h
	 *            Hours value
	 * @param m
	 *            Minutes value
	 */
	public void setTime( int h, int m )
	{
		// If minutes value is too large, adjust it
		// by mod 60, and add to hours value.

		if ( m > 59 )
		{
			h = h + m / 60; // determine hours to add
			m = m % 60; // puts minutes in range
		}
		else
		{
			; // do nothing
		}
		this.hour = h % 24; // puts hours in range
		this.minute = m;
	}

	/**
	 * Returns the hour value.
	 * 
	 * @return The hour.
	 */
	public int getHour( )
	{
		return hour;
	}

	/**
	 * Returns the minute value.
	 * 
	 * @return The minute.
	 */
	public int getMinute( )
	{
		return minute;
	}

	/**
	 * Instance method to compare two times for equivalence.
	 * <p>
	 * This method is called in this manner: t1.isEqual( t2 );
	 * 
	 * @param t
	 *            A time to compare with 'this'
	 * @return True if the two times are equivalent, and false otherwise.
	 */
	public boolean isEqual( Time t )
	{
		return ( this.hour == t.hour && this.minute == t.minute );
	}

	/**
	 * Class method to compare two times for equivalence.
	 * <p>
	 * This method is called in this manner: Time.isEqual( t1, t2 );
	 * 
	 * @param t1
	 *            First time to compare
	 * @param t2
	 *            Second time to compare
	 * @return True if the two times are equivalent, and false otherwise.
	 */
	public static boolean isEqual( Time t1, Time t2 )
	{
		return ( t1.hour == t2.hour && t1.minute == t2.minute );
	}

	/**
	 * Returns true if the time value of 'this' is strictly before the
	 * parameter's time value.
	 * <p>
	 * If the two time values are equal, this method will return false.
	 * <p>
	 * First, the hours are compared. If this does not determine the result,
	 * then the minutes are compared.
	 * 
	 * @param t A Time to compare with.
	 * @return True if 'this' is before 't' and false otherwise.
	 */
	public boolean isBefore( Time t )
	{
		boolean result;

		// First, check the hours. If they are different, we
		// have the result.

		if ( this.hour < t.hour )
		{
			result = true;
		}
		else
		{
			if ( this.hour > t.hour )
			{
				result = false;
			}
			else
			{
				// The two hours are equal. The result
				// depends on comparing the minutes values.

				result = this.minute < t.minute;
			}
		}

		return result;
	}
	
	/**
	 * Returns the duration from 'this' to 't'.
	 * <p>
	 * Here are some sample durations:<br>
	 * 14:37 to 14:38 => 00:01<br>
	 * 14:37 to 14:36 => 23:59<br>
	 * 14:37 to 14:37 => 00:00<br>
	 * 14:37 to 15:37 => 01:00<br>
	 * 15:37 to 14:37 => 23:00<br>
	 * 14:37 to 15:01 => 00:24<br>
	 * 14:37 to 17:01 => 02:24<br>
	 * 23:59 to 00:01 => 00:02<br>
	 * 
	 * @param t Determine the duration from 'this' to 't'
	 * @return The duration as a Time object
	 */
	public Time duration( Time t )
	{
		Time result;
		int resultHour;
		int resultMinute;

		// Determine the minutes first.  The result may affect the
		// hours duration later.
		
		resultHour = 0;

		// Take difference between two minute values.
		
		resultMinute = t.minute - this.minute;

		// If difference was negative, add 60 minutes to reset the
		// value to between 0 and 59.  However, we took those minutes
		// from the hour value, so subtract 1 from the result hour.
		
		if ( resultMinute < 0 )
		{
			resultMinute = resultMinute + 60;
			resultHour = -1;
		}

		// Now, take difference in result hour, and add to the
		// result hour determined previously during the
		// minutes calculation.
		
		resultHour = resultHour + (t.hour - this.hour);

		// If the result is negative, add 24 hours to reset the
		// value to be between 0 and 24.
		
		if ( resultHour < 0 )
		{
			resultHour = resultHour + 24;
		}

		// Create a new time object with the result hours and minutes.
		
		result = new Time();
		result.setTime(resultHour, resultMinute);
		
		return result;
	}
}
