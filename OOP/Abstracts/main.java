package OOP.Abstracts;

import OOP.Products.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Product> shopList = new ArrayList<>();
        shopList.add(new Food("Twix", 80, 10, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 234));
        shopList.add(new HotBeverage("Coffee", 125, 17, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.7, 36));
        shopList.add(new Beverage("Bon-aqua", 74, 18, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 500));
        shopList.add(new HotBeverage("BlackTea", 77, 25, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 1.5, 32));
        shopList.add(new HotBeverage("Coffee", 125, 17, new GregorianCalendar(2023, Calendar.NOVEMBER, 0, 0, 0), 0.5, 36));
        shopList.add(new Food("Bread", 90, 50, new GregorianCalendar(2023, Calendar.NOVEMBER, 10, 0, 0), 252));


        Human Gregor = new Human("Gregor", true, false, 1000);


        System.out.println(Gregor.createOrder(shopList));


    }


}
/*
* createOrder()...
* Проверить наличие продуктов quantity > 0
* Запомнить стоимость всех продуктов
* Создать объект Order с полями List<Product>, который содержит только продукты из наличия,
*   и поле стоимость - сумма цен продуктов, входящих в заказ.
*
* Вернуть объект Order. В классе Order переопределить метод toString() - показывать состав заказа, заказчика и общую стоимость продуктов.
* */

