package ExceptionHandling.SecondLesson.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите дробное число (через точку): ");
            String out = scanner.nextLine();
            float num = parseFloat(out);
            System.out.println("\nВведеное число: " + num);
        } catch (Exception ignored){

        }
    }
    private static float parseFloat(String line) {
        if (line.indexOf(".") != -1){
            line.replace('.', ',');
        }
        float num;
        try {
            num = Float.parseFloat(line);
        } catch (NumberFormatException e) {
            System.out.println("\nПроверьте корректность данных");
            method();
        }

        return num = Float.parseFloat(line);
    }
}
