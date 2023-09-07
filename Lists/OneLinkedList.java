package Lists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OneLinkedList {
    public static void main(String[] args) {
        sortLenghtOptimized();
    }
    public static void exPass(){

        Map<String, String> workers = new HashMap<>();
        workers.put("100", "Ivanov");
        workers.put("101", "Petrov");
        workers.put("102", "Sidorov");
        workers.put("103", "Sosnov");
        workers.put("104", "Evalion");
        workers.put("105", "Kalipos");

        for (Map.Entry<String, String> worker : workers.entrySet()) {
            System.out.printf("Num passport: %s, Worker: %s\n", worker.getKey(), worker.getValue());
        }
    }

    public static void rimToAraab(){
        Map<Character, Integer> rimNums = new HashMap<>();
        rimNums.put('I', 1);
        rimNums.put('V', 5);
        rimNums.put('X', 10);
        rimNums.put('L', 50);
        rimNums.put('C', 100);
        rimNums.put('D', 500);
        rimNums.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        char[] romeNumber = scanner.nextLine().toUpperCase().toCharArray();
        int result = 0;
        scanner.close();

        for (int i = 0; i < romeNumber.length; i++) {
            if (i != romeNumber.length -1 && rimNums.get(romeNumber[i]) < rimNums.get(romeNumber[i+1])) {
                result+= rimNums.get(romeNumber[i+1]) - rimNums.get(romeNumber[i]);
                i++;
             } else { 
                result+=rimNums.get(romeNumber[i]); 
            }
        } System.out.println("Результат: " + result);
    }

    public static void sortLenght(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String[] words = scanner.nextLine().split(" ");
        

        Map<Integer, String> sortedWords = new TreeMap<>();
        for (String word : words) {
            sortedWords.put(word.length(), word);        }
        System.out.println(sortedWords);
        scanner.close();
    }

    public static void sortLenghtOptimized(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String[] words = scanner.nextLine().split(" ");

        Map<Integer,LinkedList<String>> sortedWords = new TreeMap<>();

        for (String word : words) {
            if(sortedWords.containsKey(word.length())){
                sortedWords.get(word.length()).add(word);}
            else {
                sortedWords.put(word.length(), new LinkedList<>());
                sortedWords.get(word.length()).add(word);}}
        System.out.println(sortedWords);
        scanner.close();
    }
}
