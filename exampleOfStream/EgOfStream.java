package exampleOfStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EgOfStream {
  public void testStream(){
    List<String> names = Arrays.asList("win nyein", "aye wutthmone", "myat mon");

    List<String> filterNames = names.stream().filter(name-> name.startsWith("a")).collect(Collectors.toList());
    System.out.println(filterNames);

    List<String>  sortedNames = names.stream().map(name->name.toUpperCase()).sorted().collect(Collectors.toList());
    System.out.println(sortedNames);

    List<Integer> numbers = Arrays.asList(1,34,54,68,36);
    int sumOfEvenNumbers = numbers.stream().filter(num-> ((num % 2) == 0)).reduce(0,(sum,num)-> sum+num);
    System.out.println(sumOfEvenNumbers);
  }

  public void testParallelStream(){
    int count = 10_000_000;
    List<Integer> nums = new ArrayList<>(count);
    Random ran = new Random();
    for(int i = 0; i < count; i++){
      nums.add(ran.nextInt(100));
    }

    long start = System.currentTimeMillis();
    int sum = nums.stream().map(num -> num * 2).reduce(0, (s,n) -> s+n);
    long end = System.currentTimeMillis();
    System.out.println("Sum with normal Stream : " + sum + "(" + (end - start) + " ms)! ");

    long startForPara = System.currentTimeMillis();
    int sumForPara = nums.parallelStream().map(num -> num * 2).reduce(0, (s,n) -> s+n);
    long endForPara = System.currentTimeMillis();
    System.out.println("Sum with Parallel Stream : " + sumForPara + "(" + (endForPara - startForPara) + " ms)! ");
  }
}
