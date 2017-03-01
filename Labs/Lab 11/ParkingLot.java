public class ParkingLot
{
  
  private int parkingLotSize;
  private ParkingPlace[] places;
  
  public ParkingLot(int size)
  {
    parkingLotSize = size;
    places = new ParkingPlace[size];
    for (int i = 0; i < size; ++i)
    {
      places[i] = new ParkingPlace();
    }
  }
  
  public int firstFreePlace()
  {
    return UseParkingPlace.firstFreePlace(this.places);
  }
  
  public int countFreePlaces()
  {
    return UseParkingPlace.countFreePlaces(this.places);
  }
  
  public int[] freePlaces()
  {
    return UseParkingPlace.freePlaces(this.places);
  }
  
  public void carEnters(String car, int hour, int minutes)
  {
    UseParkingPlace.carEnters(this.places, car, hour, minutes);
  }
  
  public void carExits(String car)
  {
    UseParkingPlace.carExits(this.places, car);
  }
  
  public int longestParkedCar()
  {
    return UseParkingPlace.longestParkedCar(this.places);
  }
  
  public String[] allParkedCars()
  {
    return UseParkingPlace.allParkedCars(this.places);
  }
  
  public String[] allParkingPlaces()
  {
    return UseParkingPlace.allParkingPlaces(this.places);
  }
}