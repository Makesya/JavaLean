package OOP.Abstracts;

import OOP.Products.Product;

import java.util.List;

public interface ActorBehaviour {
    void setMakeOrder(boolean x);
    void setTakeOrder(boolean x);
    boolean isMakeOrder();
    boolean isTakeOrder();

    Order MakeOrder(List<String> myList);
    Order TakeOrder();
}
