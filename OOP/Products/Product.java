package OOP.Products;
/*
 Нарушений принципов SOLID не обнаружил
 Класс Product и методы в нем отвечаю только за продукты
*/
import java.util.Calendar;
public abstract class Product implements Comparable<Product>{
  private static int counter = 0;
  private final int count;
  private String name;
  private int price;
  private int quantity;
  private Calendar bestBefore;

  public Product(String name, int price, int quantity, Calendar bestBefore) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.bestBefore = bestBefore;
    counter++;
    count=counter;
  }

  public String getName() {return name;}
  public int getPrice() {return price;}
  public int getQuantity() {return quantity;}
  public Calendar getBestBefore() {return bestBefore;}
  public void setName(String name) {this.name = name;}
  public void setPrice(int price) {this.price = price;}
  public void setQuantity(int quantity) {this.quantity = quantity;}
  public void setBestBefore(Calendar bestBefore) {this.bestBefore = bestBefore;}

  @Override
  public String toString() {
    return  "\n" + "[" + count +"] "+ "Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", BestBefore: "
        + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH);
  }

  @Override
  public int compareTo(Product o) {
    return Integer.compare(this.quantity, o.quantity);
  }
}
