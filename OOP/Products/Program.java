package OOP.Products;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 234);
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 252);
    Product product3 = new Food("Snicers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 45);
    Product product4 = new Beverage("Bonaqua", 74, 18, new GregorianCalendar(2023, 10, 0, 0, 0), 500);
    Product product5 = new HotBeverage("BlackTea", 77, 25, new GregorianCalendar(2023, 10, 0, 0, 0), 0.7, 32);
    Product product6 = new HotBeverage("Coffe", 125, 17, new GregorianCalendar(2023, 10, 0, 0, 0), 0.7, 32);
    Product product7 = new HotBeverage("Water", 11, 25, new GregorianCalendar(2023, 10, 0, 0, 0), 0.7, 32);

    Automat list = new Automat();
    AutomatHotBevearage xlist = new AutomatHotBevearage();

    List<Product> myList = new ArrayList<>();
    List<HotBeverage> mList = new ArrayList<>();

    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    myList.add(product4);

    mList.add((HotBeverage) product5);
    mList.add((HotBeverage) product6);
    mList.add((HotBeverage) product7);
    
    list.initProduct(myList);
    xlist.initHotBeverage(mList);

    System.out.println();
    System.out.println("==================== Product Automat ======================");
    System.out.println(list.getProduct("Mars").toString());
    System.out.println(list.getProduct("Bonaqua").toString());
    System.out.println("================= Hot Beverages Automat ===================");
    System.out.println(xlist.getProduct("BlackTea").toString());
    System.out.println(xlist.getProduct("Coffe").toString());
    System.out.println(xlist.getProduct("Water").toString());

  }
}
