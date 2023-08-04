package OOP.UsersInterface.Model.Data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DataBase {
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Teacher> teacherList = new ArrayList<>();

    public void addTeacher(String firstName, String lastName, Calendar birthDay, String discipline){
        ArrayList<String> disc = new ArrayList<>();
        ArrayList<String> dep = new ArrayList<>();
        dep.add("Not defined");
        disc.add(discipline);
        teacherList.add(new Teacher(firstName, lastName, birthDay, disc, 0, dep));
    }
    public void addStudent(String firstName, String lastName, Calendar birthDay, String group, String specialization){
        studentList.add(new Student(firstName, lastName, birthDay, group, specialization, 0));
    }
}
