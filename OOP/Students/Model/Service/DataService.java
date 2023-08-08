package OOP.Students.Model.Service;
import OOP.Students.Model.Student;
import OOP.Students.Model.Teacher;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public interface DataService {
    Student createStudent(String firstName, String lastName, GregorianCalendar birthDay);
    Teacher createTeacher(String firstName, String lastName, GregorianCalendar birthDay);
    ArrayList<Student> getListStudent();
    ArrayList<Teacher> getListTeacher();
}