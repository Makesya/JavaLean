package OOP.Products;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 234);
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 252);
    Product product3 = new Food("Snickers", 60, 15, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 45);
    Product product4 = new Beverage("Bon-aqua", 74, 18, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 500);
    Product product5 = new HotBeverage("BlackTea", 77, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 32);
    Product product6 = new HotBeverage("Coffee", 125, 17, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 36);
    Product product7 = new HotBeverage("Water", 11, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 15);

    Automate autoList = new Automate();
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
    
    autoList.initProduct(myList);
    xlist.initHotBeverage(mList);

    System.out.println();
    System.out.println("==================== Product Automat ======================");
    System.out.println(autoList.getProduct("Mars").toString());
    System.out.println(autoList.getProduct("Bon-aqua").toString());
    System.out.println("================= Hot Beverages Automat ===================");
    System.out.println(xlist.getProduct("BlackTea").toString());
    System.out.println(xlist.getProduct("Coffee").toString());
    System.out.println(xlist.getProduct("Water").toString());

  }
}
