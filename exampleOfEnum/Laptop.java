package exampleOfEnum;

public enum Laptop {
  Macbook(3000),Msi(3500), Asus(4000),Lenovo();
  
  private int price;
  private Laptop(){
    price = 1000;
  }
  private Laptop(int price){
    this.price = price;
  }

  public int getPrice (){
    return this.price;
  }

  public void setPrice(int price){
    this.price = price;
  }
}
