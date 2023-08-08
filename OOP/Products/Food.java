package OOP.Products;
/*
 Нарушений принципов SOLID не обнаружил
*/
import java.util.Calendar;

public class Food extends Product {
    private double weight;

    public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
    super(name, price, quantity, bestBefore);
    this.weight = weight;
    }
    @Override
    public String toString() {
        return super.toString() + ", Weight: " + String.valueOf(weight);
}}
