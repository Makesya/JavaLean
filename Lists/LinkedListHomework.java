package Lists;// Ф.И.      - Усов максим
// № Группы  - Пока не нашёл где взять :( 

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListHomework {
    public static void main(String[] args) {
            method();
    }
    public static void method(){
        Deque<Integer> intFirst = new LinkedList<>();
        Deque<Integer> intSecond = new LinkedList<>();
        boolean xFirst = true;
        boolean xSecond = true;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            String data = scanner.nextLine();
            for (String item : data.split("")) {
               if (item.equals("-") ) {
                xFirst = false;
                continue;}
                intFirst.addLast(Integer.parseInt(item));}


            System.out.print("Введите второе число: ");
            data = scanner.nextLine();
            for (String item : data.split("")) {
               if (item.equals("-") ) {
                xSecond = false;
                continue;}
                intSecond.addLast(Integer.parseInt(item));}
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (intFirst.size() != intSecond.size()) {
                System.out.println("Длина чисел должна быть одинакова!");
                return;
            }
            LinkedList<Integer> muList = new LinkedList<Integer>();
            LinkedList<Integer> suList = new LinkedList<Integer>();

            System.out.printf("\nПервое число: %s", intFirst);
            System.out.printf("\nВторое число: %s", intSecond);

            for (int i = 0; i < intFirst.size()+3; i++) {
                if (xFirst == false){
                    suList.addFirst(intSecond.getLast() - intFirst.getLast());
                    muList.addFirst(intFirst.getLast() * intSecond.getLast()*-1);} 
                else if (xSecond == false){
                    muList.addFirst(intFirst.getLast() * intSecond.getLast()*-1); 
                    suList.addFirst(intFirst.getLast() - intSecond.getLast());}
                else {suList.addFirst(intFirst.getLast() + intSecond.getLast());
                    muList.addFirst(intFirst.getLast() * intSecond.getLast());}

                intFirst.removeLast();
                intSecond.removeLast();
            }

            System.out.printf("\nСложние: %s", suList);
            System.out.printf("\nУмножение: %s", muList);
    }
}