package exampleOfInterface;

public interface Vehicle {
  String typeOfVehicle = "for land";
  
  void showColor();
 
  default void drive(){
   System.out.println("This vehicle can drive on land!");
  }
 
  public static void vehicleType(){
   System.out.println("It depends on specific vehicle!");
  }
 }