package OOP.StandartInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studyGroup = new ArrayList<>();
        for (int i = 0; i < 10; i++) {studyGroup.add(new Student(String.format("Student #%d", i), i));}

        for (var student:studyGroup) {
            System.out.println(student);
        }





    }
}
