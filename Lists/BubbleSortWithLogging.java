package Lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BubbleSortWithLogging {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;}}
            writeArrayToLog(array);
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 10, 8, 1};
        
        System.out.println("Массив до сортировки:");
        printArray(array);
        bubbleSort(array);
        System.out.println("Массив после сортировки:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void writeArrayToLog(int[] array) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.newLine();
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
