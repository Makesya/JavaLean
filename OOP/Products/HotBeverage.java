package OOP.Products;

import java.util.Calendar;

public class HotBeverage extends Beverage {

    private int temperature;

    public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, int temperature) {
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + String.valueOf(temperature);
    
}}
