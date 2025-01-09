package exampleOfInnerClass;

//for local inner class
public class OuterClassForLocal {
  private String name = "Local Inner Class";
  public void showClassName(){
     class InnerClassForLocal{
      public void showClassName(){
        System.out.println("This is " + name);
      }
     }

     InnerClassForLocal innerClassForLocal = new InnerClassForLocal();
     innerClassForLocal.showClassName();
  }
}
