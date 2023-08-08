package OOP.Students.Viewer;

import OOP.Students.Controller.Controller;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Interface {
    private final Scanner sc = new Scanner(System.in);
    private final Controller controller = new Controller();

    public void runInterface(){
        while (true){
            clear();
            System.out.println("""
                    ========================
                    1. Создать студента
                    2. Создать преподователя
                    3. Список студентов
                    4. Список преподователей
                    5. Выход
                    ========================""");
            switch (sc.nextLine()) {
                case "1" -> createStudent();
                case "2" -> createTeacher();
                case "3" -> showStudents();
                case "4" -> showTeachers();
                case "5" -> exitInterface();
                default -> {return;}
            }
        }
    }

    private void exitInterface() {
        clear();
        System.out.println("Завершение программы...");
        System.exit(0);
    }

    private void showTeachers() {
        controller.getTeachers();
    }

    private void showStudents() {
        controller.getStudents();
    }

    private void createTeacher() {
        clear();
        System.out.print("Введите имя: ");
        String firstName = sc.nextLine();
        System.out.print("Фамилия: ");
        String lastName = sc.nextLine();
        System.out.print("Дата рождения (dd.mm.yyyy): ");
        String[] day = sc.nextLine().split("\\.");
        GregorianCalendar birthDay = new GregorianCalendar(Integer.parseInt(day[2]), Integer.parseInt(day[1]), Integer.parseInt(day[0]));

        controller.createTeacher(firstName, lastName, birthDay);
    }

    private void createStudent() {
        clear();
        System.out.print("Введите имя: ");
        String firstName = sc.nextLine();
        System.out.print("Фамилия: ");
        String lastName = sc.nextLine();
        System.out.print("Дата рождения (dd.mm.yyyy): ");
        String[] day = sc.nextLine().split("\\.");
        GregorianCalendar birthDay = new GregorianCalendar(Integer.parseInt(day[2]), Integer.parseInt(day[1]), Integer.parseInt(day[0]));

        controller.createStudent(firstName, lastName, birthDay);
    }
    private void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
