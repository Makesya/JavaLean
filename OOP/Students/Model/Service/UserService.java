package OOP.Students.Model.Service;
import OOP.Students.Model.DataBase;
import OOP.Students.Model.Student;
import OOP.Students.Model.Teacher;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class UserService implements DataService {

    private static final DataBase db = new DataBase();

    @Override
    public Student createStudent(String firstName, String lastName, GregorianCalendar birthDay){
        Student student = new Student(firstName,lastName,birthDay);
        db.addDataStudent(student);
        return student;

    }
    @Override
    public Teacher createTeacher(String firstName, String lastName, GregorianCalendar birthDay) {
        Teacher teacher = new Teacher(firstName,lastName, birthDay);
        db.addDataTeacher(teacher);
        return teacher;
    }

    @Override
    public ArrayList<Student> getListStudent() {
        return db.getDataStudents();
    }

    @Override
    public ArrayList<Teacher> getListTeacher() {
        return db.getDataTeachers();
    }

}