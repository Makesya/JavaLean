//Усов Максим

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class HashMapPhoneBook {
    public static void main(String[] args) throws InterruptedException {
        phoneDatabase();
    }
    public static void phoneDatabase() throws InterruptedException{
        
        try {
            Map<String,LinkedList<Integer>> phoneBook = new HashMap<>();

        do {
            clear();
            System.out.println("1. Добавить");
            System.out.println("2. Показать");
            System.out.println("3. Удалить");
            System.out.println("4. Выход");
            Scanner scanner = new Scanner(System.in);
            String inVar = scanner.nextLine();

                
      switch (inVar) {
                case "1": add(phoneBook); break;
                case "2": show(phoneBook); break;
                case "3": delete(phoneBook); break;
                case "4": exit();
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
                
    }
    private static void add(Map<String, LinkedList<Integer>> phoneBook) throws InterruptedException {
        while(true){
            try {
                clear();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = scanner.nextLine().toLowerCase();
            System.out.print("\nВведите номер телефона (без +7, 7, 8): ");
            String numberPhone = scanner.nextLine();
            if (numberPhone.isEmpty()) {
                System.out.println("Номер телефона не может быть пустым...");
                scanner.nextLine();
                return;}

            System.out.printf("\nКонтакт сохранен\n %s : %s\nНажмите для продолжения..", name, numberPhone);
                
                if(! phoneBook.containsKey(name)){
                    phoneBook.put(name, new LinkedList<>());
                    phoneBook.get(name).add(Integer.parseInt(numberPhone));
                } else {
                    phoneBook.get(name).add(Integer.parseInt(numberPhone));
                }

            scanner.nextLine();
            return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }

        }
    }
    private static void show(Map<String, LinkedList<Integer>> phoneBook) throws InterruptedException {
        clear();
        if (phoneBook.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Телефонная книга пуста");
            System.out.println("Нажмите для продолжения..");
            scanner.nextLine();
            return;
        } else {
            for (Map.Entry<String, LinkedList<Integer>> contact : phoneBook.entrySet()) {
                System.out.printf("%s: %s\n", contact.getKey(), contact.getValue().toString());}

            Scanner scanner = new Scanner(System.in);
            System.out.println("Нажмите для продолжения..");
            scanner.nextLine();
        }
    }
    private static void delete(Map<String, LinkedList<Integer>> phoneBook) {
        try {
            clear();
        if (!phoneBook.isEmpty()){
            for (Map.Entry<String, LinkedList<Integer>> contact : phoneBook.entrySet()) {
                System.out.printf("%s ", contact.getKey());}
        }
        System.out.print("\nВведите имя контакта: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        clear();
        if (! phoneBook.containsKey(name)){
            clear();
            System.out.println("Такого контакта не существует..");
            scanner.nextLine();
            return;
        }
        
        System.out.printf("Какой номер удалить у %s:\n", name);
        for (int i = 0; i < phoneBook.get(name).size(); i++) {
            System.out.printf("%d. %d\n", i, phoneBook.get(name).get(i));
        }
        System.out.println("99. Удалить все");
        System.out.print("\n====> ");
        int delNum = Integer.parseInt(scanner.nextLine());
        
        if (delNum == 99) {
            phoneBook.remove(name);}
        else {
            phoneBook.get(name).remove(delNum);
        }

        } catch (Exception e) {
            System.out.printf("\nОшибка ввода (%s)",e);
            System.out.println("\nНажмите чтобы продолжить...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            return;
        }
    }
    public static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    public static void exit() throws InterruptedException{
        clear();
        System.out.println("Завершение программы...");
        for (int i = 0; i < 5; i++) {
            System.out.print("= ");
            Thread.sleep(500, 0);
        } clear();System.exit(0);
    }
}
