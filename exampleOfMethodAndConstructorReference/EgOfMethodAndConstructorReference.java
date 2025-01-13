package exampleOfMethodAndConstructorReference;

import java.util.Arrays;
import java.util.List;

class  Student{
  private String name;
   public Student(String name){
    this.name = name;
   }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 
}

public class EgOfMethodAndConstructorReference {
   public void testMethodAndConstructorRef(){
    List<String> students = Arrays.asList("Win Nyein", "Aye Wutthmone", "Myat Mon");
    
    List<String> upperCaseStudentsName = students.stream().map(String::toUpperCase).toList();
    System.out.println(upperCaseStudentsName);

    List<Student> studentsObj = students.stream().map(Student::new).toList();
    System.out.println(studentsObj);

    studentsObj.stream().map(Student::getName).forEach(System.out::println);

   }

}
