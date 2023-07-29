package OOP.Abstracts;

import OOP.Products.Automate;
import OOP.Products.Product;

import java.util.*;

public class Order{
    private ArrayList <Product> list = new ArrayList<>();
    private Human man;
    private int cost;

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public Human getMan() {
        return man;
    }

    public void setMan(Human man) {
        this.man = man;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
                    prod.computeIfPresent(prodName, (k, v) -> v=list.get(finalI).getQuantity());}} };

    @Override
    public String toString() {
        return String.format("ShopList: " + list) + "\nTotal purchase price: " + cost;
    }
}

