package exampleOfThread;

public class CounterForThread {
  private int count = 0;

  //synchronized method to access one after another by multiple thread
  public synchronized void increment(){
      count++;
  }

  public int getCount(){
    return count;
  }

}
