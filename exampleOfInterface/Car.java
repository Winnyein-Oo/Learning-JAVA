package exampleOfInterface;

public class Car implements Vehicle{
  private String color;
  public Car(String color){
    this.color = color;
  }
  public void showColor(){
    System.out.println("The color of this car is " + color);
  }


}
