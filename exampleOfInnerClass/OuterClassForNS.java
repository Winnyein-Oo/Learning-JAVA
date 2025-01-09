package exampleOfInnerClass;

//for non static inner class

public class OuterClassForNS {
  private String name = "Non Static Inner Class";

  public class InnerClassForNS {
    
     public void showClassName(){
      System.out.println("This is " + name);
     }
    
  }
}
