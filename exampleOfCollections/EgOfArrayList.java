package exampleOfCollections;

import java.util.ArrayList;

public class EgOfArrayList {
  public void test(){
    ArrayList<String> list = new ArrayList<>();

    //add element
    list.add("Banana");
    list.add("Apple");
    list.add("Orange");
    list.add(3, "Lemon"); 

    System.out.println(list);

    System.out.println(list.get(2));
    list.set(1,"New Apple");
    list.remove(3);
    System.out.println(list);
  }
}
