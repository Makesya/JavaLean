package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerList {
    public static void main(String[] args) {
        intList(10, 33);
    }
    public static void intList(int size, int max){
        List<Integer> intList = new ArrayList<>();
        
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < size; i++) 
            intList.add(i, rand.nextInt(max));
        System.out.println("Сгенерирован массив: ");
        int maxValue = intList.get(0);
        int minValue = intList.get(0);
        for (Integer integer : intList)     
            System.out.print(integer + " ");
        System.out.println("\n\nБез четных чисел:");
        for (int i = 0; i < size; i++) {
            if (intList.get(i) > maxValue) maxValue = intList.get(i);
            if (intList.get(i) < minValue) minValue = intList.get(i);
            sum += intList.get(i);
            if (intList.get(i) % 2 != 0){
            System.out.print(intList.get(i) + " "); }
    }
    System.out.printf("\n\nМаксимальное: %d\nМинимальное: %d\nСреднее: %d", maxValue, minValue, sum/intList.size());
}}
