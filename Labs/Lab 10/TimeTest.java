import junit.framework.Assert;
import junit.framework.TestCase;

public class TimeTest extends TestCase
{

	/*
	 * Test method for 'Time.setTime(int, int)'
	 */
	public void testSetTimeNormal( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		
		int expected = 14;
		int actual = t1.getHour();
		Assert.assertEquals( expected, actual );

		expected = 37;
		actual = t1.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testSetTimeLargeMin( )
	{
		Time t1 = new Time();
		t1.setTime(14, 77);
		
		int expected = 15;
		int actual = t1.getHour();
		Assert.assertEquals( expected, actual );

		expected = 17;
		actual = t1.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testSetTimeLargeHour( )
	{
		Time t1 = new Time();
		t1.setTime(25, 37);
		
		int expected = 1;
		int actual = t1.getHour();
		Assert.assertEquals( expected, actual );

		expected = 37;
		actual = t1.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testSetTimeRollover( )
	{
		Time t1 = new Time();
		t1.setTime(23, 61);
		
		int expected = 0;
		int actual = t1.getHour();
		Assert.assertEquals( expected, actual );

		expected = 1;
		actual = t1.getMinute();
		Assert.assertEquals( expected, actual );
	}

	/*
	 * Test method for 'Time.isEqual(Time)'
	 */
	public void testIsEqualTimeTrue( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = true;
		boolean actual = t1.isEqual(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsEqualTimeMinutesDiffer( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 36);
		
		boolean expected = false;
		boolean actual = t1.isEqual(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsEqualTimeHoursDiffer( )
	{
		Time t1 = new Time();
		t1.setTime(13, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = false;
		boolean actual = t1.isEqual(t2);
		Assert.assertEquals( expected, actual );
	}

	/*
	 * Test method for 'Time.isEqual(Time, Time)'
	 */
	public void testIsEqualTimeTimeTrue( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = true;
		boolean actual = Time.isEqual(t1, t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsEqualTimeTimeMinutesDiffer( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 36);
		
		boolean expected = false;
		boolean actual = Time.isEqual(t1, t2);
		Assert.assertEquals( expected, actual );

	}

	public void testIsEqualTimeTimeHoursDiffer( )
	{
		Time t1 = new Time();
		t1.setTime(13, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = false;
		boolean actual = Time.isEqual(t1, t2);
		Assert.assertEquals( expected, actual );

	}

	/*
	 * Test method for 'Time.isBefore(Time)'
	 */
	public void testIsBeforeTrueH( )
	{
		Time t1 = new Time();
		t1.setTime(13, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = true;
		boolean actual = t1.isBefore(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsBeforeTrueM( )
	{
		Time t1 = new Time();
		t1.setTime(14, 36);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = true;
		boolean actual = t1.isBefore(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsBeforeEqual( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = false;
		boolean actual = t1.isBefore(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsBeforeFalseM( )
	{
		Time t1 = new Time();
		t1.setTime(14, 38);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = false;
		boolean actual = t1.isBefore(t2);
		Assert.assertEquals( expected, actual );
	}

	public void testIsBeforeFalseH( )
	{
		Time t1 = new Time();
		t1.setTime(15, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		boolean expected = false;
		boolean actual = t1.isBefore(t2);
		Assert.assertEquals( expected, actual );
	}

	/*
	 * Test method for 'Time.duration(Time)'
	 */
	public void testDuration1( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(15, 37);
		
		Time t3 = t1.duration(t2);
		
		int expected = 1;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 0;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration2( )
	{
		Time t1 = new Time();
		t1.setTime(15, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		Time t3 = t1.duration(t2);
		
		int expected = 23;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 0;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration3( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 38);
		
		Time t3 = t1.duration(t2);
		
		int expected = 0;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 1;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration4( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(15, 1);
		
		Time t3 = t1.duration(t2);
		
		int expected = 0;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 24;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration5( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(17, 1);
		
		Time t3 = t1.duration(t2);
		
		int expected = 2;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 24;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration6( )
	{
		Time t1 = new Time();
		t1.setTime(23, 59);
		Time t2 = new Time();
		t2.setTime(0, 1);
		
		Time t3 = t1.duration(t2);
		
		int expected = 0;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 2;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration7( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 36);
		
		Time t3 = t1.duration(t2);
		
		int expected = 23;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 59;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}

	public void testDuration8( )
	{
		Time t1 = new Time();
		t1.setTime(14, 37);
		Time t2 = new Time();
		t2.setTime(14, 37);
		
		Time t3 = t1.duration(t2);
		
		int expected = 0;
		int actual = t3.getHour();
		Assert.assertEquals( expected, actual );

		expected = 0;
		actual = t3.getMinute();
		Assert.assertEquals( expected, actual );
	}


}
