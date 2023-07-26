package OOP.Abstracts;

import OOP.Products.Automate;
import OOP.Products.Product;

import java.util.*;

public class Order{
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




        //########################################################

        void validateOrder(){
            HashMap<String, Integer> prod = new HashMap<>();

            for (int i = 0; i < list.size(); i++) {
                String prodName = list.get(i).getName();
                if (prod.containsValue(prodName)){
                    prod.computeIfPresent(prodName, (k, v) -> v + 1);
                } else {prod.put(prodName, 1);}}
            for (int i = 0; i < list.size(); i++) {
                String prodName = list.get(i).getName();
                if (prod.get(prodName) > list.get(i).getQuantity()){
                    int finalI = i;
                    prod.computeIfPresent(prodName, (k, v) -> v=list.get(finalI).getQuantity());
                }
            }
        };



    }

