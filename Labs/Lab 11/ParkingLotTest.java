class ParkingLotTest
{
  public static void main(String[] args)
  {
    ParkingLot lot1 = new ParkingLot(5);
    lot1.carEnters("JKL123", 3, 35);
    lot1.carEnters("FCR123", 4, 67);
    lot1.carEnters("AL 123", 5, 01);
    lot1.carEnters("GW 423", 1, 12);
    lot1.carEnters("ASM323", 6, 12);
    
    lot1.carEnters("MEM888", 7,10); //Should not enter the lot
    
    lot1.carExits("FCR123");
    
    lot1.carEnters("MEM888", 7,10);//Should enter now
    
    int index = lot1.longestParkedCar();
    System.out.println("Index of Longest Parked Car "  + index);
    
    lot1.carExits("ASM323");
    
    int[] fp = lot1.freePlaces();
    printIndexFreePlaces(fp);
    
    printCars(lot1);    
  }
  
  public static void printIndexFreePlaces(int [] p)
  {
    for (int i = 0; i < p.length; ++i)
    {
      System.out.println("Free Place Index:" + i );
    }
  }
  
  public static void printCars(ParkingLot lot)
  {
    String[] cars = lot.allParkingPlaces();
    
    if  (cars.length == 0)
      System.out.println("ParkingLot is empty");
    
    for (int i = 0; i < cars.length; ++i)
    {
      System.out.println("Place:" + (i+1) + " Car:" + cars[i]);
    }
  }
}