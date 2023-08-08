package OOP.Products;

/*
 Нарушения принципов SOLID:
 Метод createOrder - Нарушение принципа S(Single Responsibility Principle)
 данный метод должен находиться в классе Order
*/

import OOP.Abstracts.Order;
import java.util.ArrayList;
import java.util.List;

public class Automate implements AutoInterface{

  List<Product> listProduct = new ArrayList<>();

  /**
   * Метод иницилизирует список продуктов в автомат
   **/
  public void initProduct(List<Product> myList) {
    listProduct = myList;
  }

  public Product getProduct(String name) {
    for (Product el : listProduct) {
      if (el.getName().equals(name)) {
        return el;
      }
    }
    return null;
  }
/**
 * Метод создает ордер на покупку
 **/
  public Order createOrder(List<String> mylist){

    return null;
  }
/**
 * Добавляет продукт в автомат
 * **/
  @Override
  public void addProduct(Product product) {
    this.listProduct.add(product);
  }

  @Override
  public String toString() {
    return "Automate: "  + listProduct;
  }
}


/*

S - Single Responsibility Principle - принцип единственной ответственности. Каждый класс должен иметь только одну зону ответственности.

O - Open closed Principle - принцип открытости-закрытости. Классы должны быть открыты для расширения, но закрыты для изменения.

L - Liskov substitution Principle - принцип подстановки Барбары Лисков. Должна быть возможность вместо базового (родительского) типа (класса) подставить любой его подтип (класс-наследник), при этом работа программы не должна измениться.

I -  Interface Segregation Principle - принцип разделения интерфейсов. Данный принцип обозначает, что не нужно заставлять клиента (класс) реализовывать интерфейс, который не имеет к нему отношения.

D - Dependency Inversion Principle - принцип инверсии зависимостей. Модули верхнего уровня не должны зависеть от модулей нижнего уровня. И те, и другие должны зависеть от абстракции. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

*/