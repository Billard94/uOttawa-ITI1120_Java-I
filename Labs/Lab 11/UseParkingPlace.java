public class UseParkingPlace
{
  public static final int NOFREEPLACE = -1;
  
  /*
   * Given a ParkingPlace array p returns the index of the first free parking place.
   * @param a ParkingPlace[] array
   * @return an int value with the index of the first free parking place. -1(NOFREEPLACE)
   *         otherwise.
   * */
  public static int firstFreePlace(ParkingPlace[] p)
  {
     int indexFreePlace = NOFREEPLACE;
     for (int i = 0; i < p.length; ++i)
     {
        if (p[i].free())
        {
          indexFreePlace = i;
          break;
        }
     }
     return indexFreePlace;
  }
  
  /*
   * Returns the amount of free places in the array of parking places.
   * @param a ParkingPlace[] array
   * @return an int value with the number of free places in the input array.
   * */
  public static int countFreePlaces(ParkingPlace[] p)
  {
    int countFreePlaces = 0;
    for (int i = 0; i < p.length; ++i)
    {
      if (p[i].free())
      {
        ++countFreePlaces;
      }
    }
    return countFreePlaces;
  }
  
  /*
   * Returns an array of free places indeces.
   * @param a ParkingPlace[] array
   * @return a int[] with the indeces of the free paking places
   * */
  public static int[] freePlaces(ParkingPlace[] p)
  {
    int[] freePlaces = new int[UseParkingPlace.countFreePlaces(p)];
    int indexfreePlaces = 0;
    for (int i = 0; i < p.length; ++i)
    {
      if (p[i].free())
      {
         freePlaces[indexfreePlaces++] = i;
      }
    }
    return freePlaces;
  }
  
  /*
   * Modifies the state of the array of parking places ParkinPlace[].
   * Inserts a car in the first available parking place. If there is no free space nothing
   * is done.
   * 
   * @param ParkingPlace[] an array of parking places to modify
   * @param String the car's licence plate
   * @param int hour when the car arrives
   * @parma int minutes when the car arrives
   * */
  public static void carEnters(ParkingPlace[] p, String car, int hour, int minutes)
  {
    int indexFirstFreeSpace = UseParkingPlace.firstFreePlace(p);
    
    if (indexFirstFreeSpace != UseParkingPlace.NOFREEPLACE)
    {
      p[indexFirstFreeSpace] = new ParkingPlace();
      p[indexFirstFreeSpace].carArrives(car, hour, minutes);
    }
  }
  
  /*
   * Modifies the state of the parking place array.
   * Removes the car from the parking place with the same licence plate. 
   * @param ParkingPlace[] array of parking places.
   * @param String the car's licence plate. 
   * */
  public static void carExits(ParkingPlace[] p, String car)
  {
    for (int i = 0; i < p.length; ++i)
    {
      String parkedCar = p[i].getCar();
      if ( parkedCar != null && parkedCar.equals(car) )
      {
        p[i].carLeaves();
        break;
      }
    }
  }
  
  /*
   * Returns the index of the car that has been parked the longest.
   * @param ParkingPlace[] the array of parking places
   * @return an int value with the index of the longest parked car
   * */
  public static int longestParkedCar(ParkingPlace[] p)
  {
    int indexLongestParkedCar = -1;
    Time oldestTime = new Time();
    oldestTime.setTime(23, 59);
    for (int i = 0; i < p.length; ++i)
    {
      if (!p[i].free())
      {
        Time parkedCarTime = new Time();
        parkedCarTime.setTime(p[i].getHour(), p[i].getMinutes());
        
        if (parkedCarTime.isBefore(oldestTime))
        {
          oldestTime = parkedCarTime;
          indexLongestParkedCar = i;
        }
      }
    }
    return indexLongestParkedCar;
  }

  /*
   * Returns a list of licence's plates of all the parked cars.
   * @param ParkingPlace[] a parking place array
   * @return a String[] list with the plates of the parked cars
   * */
  public static String[] allParkedCars(ParkingPlace[] p)
  {
    int freePlaces = UseParkingPlace.countFreePlaces(p);
    
    String[] parkedCars = new String[p.length - freePlaces];
    int indexParkedCars = 0;
    for (int i = 0 ; i < p.length; i++)
    {
      if (!p[i].free())
      {
        parkedCars[indexParkedCars++] = p[i].getCar();
      }
    }
    return parkedCars;
  }
  
  /*
   * Returns an array of strings with the String representation of every single parking place in 
   * the array
   * @param ParkingPlace[] the array of parking places.
   * @return a String[] array with the Strings representation of the cars. 
   * 
   * */
  public static String[] allParkingPlaces(ParkingPlace[] p)
  {
    String[] allParkingPlaces = new String[p.length];
    for (int i = 0; i < p.length; ++i)
    {
      allParkingPlaces[i] = p[i].toString();
    }
    return allParkingPlaces;
    
  }
}