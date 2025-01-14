// import exampleOfInnerClass.*;
// import exampleOfInterface.*;
// import java.io.FileNotFoundException;
// import exampleOfEnum.Day;
// import exampleOfEnum.Laptop;
// import exampleOfEnum.Day.Days;
// import exampleOfException.CustomException;
// import exampleOfException.ExceptionExample;
// import exampleOfLambdaExpression.Greeting;

// import exampleOfThread.ClassFromRunnable;
// import exampleOfThread.ClassFromThread;
// import exampleOfThread.CounterForThread;

// import exampleOfCollections.EgOfArrayList;

// import exampleOfCollections.EgOfSet;

// import exampleOfCollections.EgOfMap;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// import exampleOfComparable.Student;
// import exampleOfComparable.StudentForComparator;

// import exampleOfStream.EgOfStream;

import exampleOfMethodAndConstructorReference.EgOfMethodAndConstructorReference;

public class Main {

  public static void main(String[] args) {
    // //non static inner class
    // OuterClassForNS outerClassForNS = new OuterClassForNS();
    // OuterClassForNS.InnerClassForNS innerClassForNS = outerClassForNS.new InnerClassForNS();
    // // outerClassForNS.showClassName();
    // innerClassForNS.showClassName();
     
    // //static inner class
    // OuterClassForStatic.InnerClassForStatic innerClassForStatic = new OuterClassForStatic.InnerClassForStatic();
    // innerClassForStatic.showClassName();
   
    // //local inner class
    // OuterClassForLocal outerClassForLocal = new OuterClassForLocal();
    // outerClassForLocal.showClassName();

    //Annonymous inner class 
    // OuterClassForAnnonymous outerClassForAnnonymous = new OuterClassForAnnonymous(){
     
    //   public void showClassName(){
    //     System.out.println("This is " + getName());
    //   }
    // };
    // outerClassForAnnonymous.showClassName();
    // System.out.println(outerClassForAnnonymous.getName());

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //interface
    // Car car = new Car("blue");
    // car.showColor(); //abstract method

    // car.drive();//default method

    // Vehicle.vehicleType(); //static method
    // System.out.println("This is used for " + Vehicle.typeOfVehicle); //static field

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //need of interface
    // Computer lap = new Laptop();
    // Computer desktop = new Desktop();

    // new Dev(lap);
    // new Dev(desktop);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //example of enum
    // Day day = new Day();
    // day.showDay(Days.Friday);
  
    // Laptop lap = Laptop.Macbook;
    // System.out.println(lap + " : $" + lap.getPrice() +"!"); 

    // lap.setPrice(5000);
    // System.out.println("Updated Laptop Prices...");
    // for (Laptop laptop : Laptop.values() ){
    //   System.out.println(laptop + " : $" + laptop.getPrice() +"!");
    // }
    
    //lambda expression
    // Greeting greeting = (name) -> System.out.println("Hello " + name + "!");
    // greeting.greet("Win Nyein Oo");
    
    //exception examples
    // ExceptionExample exceptionExample = new ExceptionExample();
    // exceptionExample.checkException();
    // exceptionExample.uncheckedException();
    // try{
    // exceptionExample.testCustomException(17);
    // }catch (CustomException e){
    //   System.out.println(e.getMessage());
    // }

  //   //examples of using multiple thread
  //   ClassFromThread classFromThread = new ClassFromThread();
  //   classFromThread.start();
     
  //   //creating runnable object and pass to Thread 
  //   ClassFromRunnable classFromRunnable = new ClassFromRunnable();
  //   Thread thread = new Thread(classFromRunnable);
  //   thread.start();

  //   //example of synchronized thread
  //   CounterForThread counterForThread = new CounterForThread();
    
  //   //overriding run method by lambda expression
  //   Runnable runnable = ()->{
  //     for(int i = 0; i< 1000; i++){
  //       counterForThread.increment();
  //     }
  //   };
  //   Thread t1 = new Thread( runnable
  //   );
    

  //   Thread t2 = new Thread(()-> {
  //     for(int i = 0; i< 1000; i++){
  //       counterForThread.increment();
  //     }
  //    }
  //   );
   
  //   t1.start();
  //   t2.start();

  //   try {
  //     t1.join();
  //     t2.join();
  //   } catch (InterruptedException e) {
  //     System.out.println(e.getMessage());
  //   }

  //   System.out.println("Final Count is " + counterForThread.getCount() +".");

    //Examples of collection api
    //arraylist
    // EgOfArrayList egOfArrayList = new EgOfArrayList();
    // egOfArrayList.test();
    
    //set
    // EgOfSet egOfSet = new EgOfSet();
    // egOfSet.testHashSet();
    // egOfSet.testLinkedHashSet();
    // egOfSet.testTreeSet();
    
    //map
    // EgOfMap egOfMap = new EgOfMap();
    // egOfMap.testHashMap();
    
    //comparable and comparator
    // ArrayList<Student> students = new ArrayList<>();
    // students.add(new Student("win nyei ",27 ));
    // students.add(new Student("aye wutthmone ",25 ));
    // students.add(new Student("myat mon ",25 ));
    // Collections.sort(students);

    // ArrayList<StudentForComparator> students = new ArrayList<>();
    // students.add(new StudentForComparator("win nyein ",27 ));
    // students.add(new StudentForComparator("aye wutthmone ",25 ));
    // students.add(new StudentForComparator("myat mon ",25 ));

    // //creating comparator
    // Comparator<StudentForComparator> ageComparator = new Comparator<StudentForComparator>() {
    //   @Override
    //   public int compare (StudentForComparator student1, StudentForComparator student2){
    //     return student2.getAge() - student1.getAge();
    //   }
    // };

    // Comparator<StudentForComparator> nameComparator = (student1, student2) -> student1.getName().compareTo(student2.getName());

    // // Collections.sort(students,ageComparator);
    // Collections.sort(students,nameComparator);
    
    // for (StudentForComparator student : students){
    //   System.out.println(student.getName() + " : " + student.getAge() );
    // }

    //Stream
    // EgOfStream egOfStream = new EgOfStream();
    // egOfStream.testStream();
    // egOfStream.testParallelStream();

    //Method and Constructor Reference
    EgOfMethodAndConstructorReference egOfMethodAndConstructorReference = new EgOfMethodAndConstructorReference();
    egOfMethodAndConstructorReference.testMethodAndConstructorRef();

  }
  
}