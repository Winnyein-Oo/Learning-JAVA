package exampleOfEnum;

public class Day {
 public enum Days {
  Monday, Tuesday, Wednesday, Thueday, Friday, Saturday, Sunday
 }

 public void showDay (Days day){
  switch (day) {
    case Monday:
      System.out.println("Start of the workweek!");
      break;
    
    case Friday:
      System.out.println("Almost weekend!");
      break;
    
    case Saturday:
    case Sunday:
      System.out.println("Rest Day...");
      break;
    
    default:
    System.out.println("Huu.. Working day!");
    break;
  }
 }
}