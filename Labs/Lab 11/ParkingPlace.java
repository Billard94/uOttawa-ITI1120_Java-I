public class ParkingPlace
{
  private String car;
  private boolean occupied;
  private Time time;
  private static final String NOCAR = "-------";
  
  /**
   * Constructor without parameters.
   * Constructs a parking place that is initially free
   * */
  public ParkingPlace()
  {
    occupied = false;
    car      = ParkingPlace.NOCAR;
    time     = null;
  }
  
  /*
   * Modifies the state of the parking place by seetting it to occupied.
   * Sets the plate and time.
   * @param plate car's licence plate
   * @param hour the hour when the place is occupied
   * @param minutes the minutes when the place is occupied
   * 
   * */
  public void carArrives(String plate, int hour, int minutes)
  {
    if (occupied)
      return;
    
    occupied = true;
    car = plate;
    time = new Time();
    time.setTime(hour,minutes);
  }
  
  /*
   * Modifies the state of the parking place by setting it to free (!occupied)
   * */
  public void carLeaves()
  {
    occupied = false;
    car = ParkingPlace.NOCAR;
    time = null;
  }
  
  /*
   * Returns if the parking place is free.
   * 
   * @return a boolean value of true if there is no car in the place.
   * */
  public boolean free()
  {
    return !occupied;
  }
  
  /*
   * Returns the car's licence plate if the place is occupied.
   * null otherwise.
   * 
   * @return a String value with the license plate. Null if there is no car.
   * */
  public String getCar()
  {
    return (occupied)? car: null;
  }
  
  /*
   * Returns the car's licence plate if the place is occupied
   * will return string "-----" if not occupied. 
   * 
   * @return a String value with the licence plate of the car.
   * */
  public String toString()
  {
    return car;
  }
  
  /*
   * Returns the hour since when the parking place is occupied, 
   * -1 otherwise.
   * 
   * @return an int value with the hour since the car was parked.
   * */
  public int getHour()
  {
    return (occupied)? time.getHour(): -1;
  }
  
  /*
   * Returns the minutes since when the parking place is occupied,
   * -1 otherwise.
   * 
   * @return an int value with the minutes since the car was parked.
   * */
  public int getMinutes()
  {
    return (occupied)? time.getMinute(): -1;
  }
}