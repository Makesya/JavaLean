package OOP.Abstracts;
import OOP.Products.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
public class Human extends Actor {

    private double money;
    private Automate NearMachine;

    public Human(String xName, boolean xisMakeOrder, boolean xisTakeOrder, double Money) {
        super(xName, xisMakeOrder, xisTakeOrder);
        this.money = Money;}
    @Override
    public void setMakeOrder(boolean x) {}
    @Override
    public void setTakeOrder(boolean x) {}
    @Override
    public boolean isMakeOrder() {
        return false;}
    @Override
    public boolean isTakeOrder() {
        return false;}
    public void FindNearAutomate(){
        Automate nearAutomate= new Automate();
        ArrayList<Product> myList = new ArrayList<>();
            myList.add(new Food("Twix", 80, 10, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 234));
            myList.add(new Food("Mars", 90, 50, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 252));
            myList.add(new Food("Snickers", 60, 15, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 45));
            myList.add(new Beverage("Bon-aqua", 74, 18, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 500));
            myList.add(new HotBeverage("BlackTea", 77, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 32));
            myList.add(new HotBeverage("Coffee", 125, 17, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 36));
            myList.add(new HotBeverage("Water", 11, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 15));
            nearAutomate.initProduct(myList);
            this.NearMachine = nearAutomate;


    }
    @Override
    public Order MakeOrder(List<String> myList) {
        ArrayList<Product> shopList = new ArrayList<>();
        Product element;
        for (String nameProduct: myList ) {
            element = NearMachine.getProduct(nameProduct);
            if (element != null) {
                shopList.add(element);
            }
        }
        setMakeOrder(true);
        return NearMachine.createOrder(myList);
    }


    @Override
    public Order TakeOrder() {
        return null;}

    public double getMoney() {
        return money;}
    public double setMoney(int value) {
        return this.money = value;}

    public Order createOrder (List<Product> cartList){
        int price = 0;
        List<Product> finalList = new ArrayList<>();
        for (Product product:cartList) {
            if (product.getQuantity() > 0) {
                finalList.add(product);
                price += product.getPrice();
            }
        }
        Order order = new Order();
        order.setCost(price);
        order.setMan(this);
        order.setList((ArrayList<Product>) finalList);
        return order;
    }
}
