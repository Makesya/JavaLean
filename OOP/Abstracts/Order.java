package OOP.Abstracts;

import OOP.Products.Product;

import java.util.ArrayList;

public class Order {
    private ArrayList <Product> list;
    private Human man;

    @Override
    public String toString() {
        StringBuilder ls = null;
        for (Product product:list){
            ls.append(product.getName() + " : " + product.getPrice() + "\n");
        }

        return String.format("Покупатель: %s\nКупил:\n%s", man, ls);
        }

    }

