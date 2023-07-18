package OOP.Products;

import java.util.Calendar;

public class Beverage extends Product {
    private double volume;

    public Beverage(String name, int price, int quantity, Calendar bestBefore, double volume) {
    super(name, price, quantity, bestBefore);
    this.volume = volume;
  }

    @Override
    public String toString() {
        return super.toString() + ", Volume: " + String.valueOf(volume);
}}
