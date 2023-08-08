package OOP.Students.Controller;

import OOP.Students.Model.Service.DataService;
import OOP.Students.Model.Service.UserService;

import java.util.GregorianCalendar;

public class Controller {
    private final DataService service = new UserService();

    public void createTeacher(String firstName, String lastName, GregorianCalendar birthDay){
        service.createTeacher(firstName, lastName, birthDay);
    }
    public void createStudent(String firstName, String lastName, GregorianCalendar birthDay){
        service.createStudent(firstName, lastName, birthDay);
    }

    public void getTeachers(){
        service.getListTeacher();
    }
    public void getStudents(){
        service.getListStudent();
    }
}
