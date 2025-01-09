package exampleOfInnerClass;

//for static inner class
public class OuterClassForStatic{
  static private String name = "Static inner class";

  static public class InnerClassForStatic{
    public void showClassName(){
      System.out.println("This is" + name);
    }
  }
}