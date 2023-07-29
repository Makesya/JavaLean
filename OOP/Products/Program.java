package OOP.Products;
import java.util.*;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 234);
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 252);
    Product product3 = new Food("Snickers", 60, 15, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 45);
    Product product4 = new Beverage("Bon-aqua", 74, 18, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 500);
    Product product5 = new HotBeverage("BlackTea", 77, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 1.5, 32);
    Product product6 = new HotBeverage("Coffee", 125, 17, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.5, 36);
    Product product7 = new HotBeverage("Water", 11, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 15);

    Automate productList = new Automate();

    List<Product> myList = new ArrayList<>();

    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    myList.add(product4);
    myList.add(product5);
    myList.add(product6);
    myList.add(product7);
    //myList.sort(new QuantityComparator());
    productList.initProduct(myList);


    System.out.println(productList);
    //myList.sort(new PriceComparator());
    System.out.println("\n======= Added BOUNTY ======= \n");
    productList.addProduct(new Food("Bounty", 125, 15, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 123));
    System.out.println(productList);
  }
}
