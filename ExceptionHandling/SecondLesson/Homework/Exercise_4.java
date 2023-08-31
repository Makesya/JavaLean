package ExceptionHandling.SecondLesson.Homework;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        throwEmptyString();
    }

    private static void throwEmptyString() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите сообщение: ");
            String check = scanner.nextLine();
            if (check == "" || check == null){
                throw new RuntimeException("Недопустим ввод пустой строки");
            }
            System.out.println(check);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
