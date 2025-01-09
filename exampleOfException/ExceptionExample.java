package exampleOfException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionExample {
  public void checkException() {
    try {
        FileReader file = new FileReader("text.txt");
        System.out.println(file);
      
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } 
  }
  
  public void uncheckedException() {
    System.out.print("Enter your age:");

    //try with resource
    try ( Scanner scanner = new Scanner(System.in);) {
      int age = scanner.nextInt();
      if(age < 18) {
        throw new ArithmeticException("You are not allowed at this age!");
      }
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
   
  }

  public void testCustomException(int age) throws CustomException{
    if(age < 18){
      throw new CustomException("You are too young to do smoking!");
    } else{
      System.out.println("You can smoke if u wanna!");
    }
  }
}
