package ExceptionHandling.SecondLesson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExercisesSecondLesson {
    public static void main(String[] args) {
        String path = "D:\\JavaProjects\\JavaLean\\ExceptionHandling\\SecondLesson\\namesInfo.txt";
        writeFile(digitReplacer(reader(path)), path);


    }

    private static List<String[]> reader(String path) {
        List<String[]> result = new ArrayList<>();
        try {
            BufferedReader file = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = file.readLine()) != null){
                String[] tempArray = line.split("=");
                if(!tempArray[1].equals("?") && !isNumber(tempArray[1])){
                    throw new RuntimeException(String.format("Incorrect data: %s", line));
                }
                result.add(tempArray);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;

    }//=====================================================
    public static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }//=====================================================
    public static List<String[]> digitReplacer(List<String[]> data){
        for (String[] line : data){
            if (line[1].equals("?")){
                line[1] = String.valueOf(line[0].length());
            }
        } return  data;
    }//=====================================================
    public static void writeFile(List<String[]> data, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path));) {
            for (String[] line : data){
                writer.write(String.format("%s=%s", line[0],line[1]));
                writer.newLine();
            }
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
//📔 Запишите в файл следующие строки:
//        Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
//        (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти
//        по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
//        Если на каком-то месте встречается символ, отличный от числа или ?,
//        бросить подходящее исключение.Записать в тот же файл
//        данные с замененными символами ?.