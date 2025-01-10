package exampleOfCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EgOfSet {
  public void testHashSet (){
    Set<String> hashSet = new HashSet<>();
    
    hashSet.add("Banana");
    hashSet.add("Orange");
    hashSet.add("Mango");
    hashSet.add("Mango");

    System.out.println(hashSet.size());
    System.out.println(hashSet);

    for(String fruit : hashSet){
      System.out.println(fruit);
    }
  }

  public void testLinkedHashSet(){
    Set<String> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add("Apple");
    linkedHashSet.add("Banana");
    linkedHashSet.add("Mango");
    linkedHashSet.add("Apple");

    System.out.println(linkedHashSet);
    linkedHashSet.stream().forEach(n->System.out.println(n));
  }

  public void testTreeSet(){
    Set<String> treeSet = new TreeSet<>();

    treeSet.add("Mango");
    treeSet.add("Apple");
    treeSet.add("Banana");


    System.out.println(treeSet);
    Iterator<String> iterator = treeSet.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  

  }
}
