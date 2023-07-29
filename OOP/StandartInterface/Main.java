package OOP.StandartInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> studyGroup = new ArrayList<>();
        for (int i = 0; i < 10; i++) {studyGroup.add(new Student(i, String.format("Student_%d", (i*i+24-32)), "Forward", new Random().nextInt(1,5)));}
        for (var student:studyGroup) {
            System.out.println(student); }


        Student mean = new Student(1, "Invasive", "Igor", 4);
        Teacher history = new Teacher(12,"Covalent","Alexandra",15,"History");
        Teacher russian = new Teacher(18,"Karenina","Vitalina",13,"Russian Language");
        Teacher biology = new Teacher(22,"Grigoriev","Anastasia",18,"Biology");

        System.out.println(history.compareTo(mean));



    }
}
