package exampleOfComparable;

public class Student implements Comparable <Student>{
  private String name;
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int age;

  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Student other){
    return other.age - this.age; //negative - > swap
  }

}

