package exampleOfCollections;

import java.util.Hashtable;
// import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.TreeMap;

public class EgOfMap {
  public void testHashMap (){
    // Map<String, Integer> students = new HashMap<>(); 
    // Map<String, Integer> students = new TreeMap<>(); 
    // Map<String, Integer> students = new LinkedHashMap<>();
    Map<String, Integer> students = new Hashtable<>(); //synchronized and thread safe

    students.put("win nyein", 98 );
    students.put("aye wuthmone", 100 );
    students.put("myat mon", 99 );
    students.put("myat mon", 100 );

    System.out.println(students);
    System.out.println(students.keySet());
    System.out.println(students.entrySet());

    for(String student : students.keySet()){
      System.out.println(student + " : " + students.get(student));
    }
  }
}
