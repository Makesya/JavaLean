package Lists;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LeanLinkedList {
    public static void main(String[] args) {
        Stack();
    }

    public static void timeCompare(){
        int arraySize = 1000000;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < arraySize; i++){
            arrayList.add(i);}
        System.out.println(System.currentTimeMillis() - startTime1);

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < arraySize; i++){
            linkedList.add(i);}
        System.out.println(System.currentTimeMillis() - startTime2);
    }

    public static void whileLinked(){
    // text~num insert to linkedList
    // print~num print and delete el to index
    // user .split()
    // over add edit  (Convert text to int)
    LinkedList<String> linkedList = new LinkedList<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            String data = "end";
            
            while (true) {
                System.out.printf("Введите команду (text~num) do %d: ", linkedList.size());
                data = scanner.nextLine();
                if (data.equals("end")) return;
                
                changeList(linkedList, data);
                System.out.println(linkedList);
               
            }
        }   
  }

    private static void changeList(LinkedList<String> linkedList, String data) {
        try {
            int index = Integer.parseInt(data.split("~")[1]);
            String text = data.split("~")[0];
            
            if (text.equals("print")) { 
                System.out.println(linkedList.get(index));
                linkedList.remove(index);
            } else {
                linkedList.add(index, text);
            }

        } catch (Exception e) {
            System.out.println("Ошибка ввода, читайте информация ниже \\/");
            System.out.println(e.getMessage());
        }
    }

    public static void Stack(){
    Deque<String> linkedList = new LinkedList<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            String data = "end";
            
            while (true) {
                System.out.print("Введите команду (print, revert, end): ");
                data = scanner.nextLine();
                if (data.equals("end")) return;
                
                changeList(linkedList, data);
                System.out.println(linkedList);
               
            }
        }   
  }

    private static void changeList(Deque<String> linkedList, String data) {
        if (data.equals("print"))
        for (String result : linkedList) {System.out.println(result);}
        if (data.equals("revert")){
            linkedList.pollFirst();
        } else if (data.equals("exit")) {System.exit(0);}
        else {
            linkedList.addFirst(data);
        }

    }
}
