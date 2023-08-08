package OOP.Students.Model;
import java.util.ArrayList;

public class DataBase {
    ArrayList<Teacher> dataTeachers = new ArrayList<>();
    ArrayList<Student> dataStudents = new ArrayList<>();

    public DataBase(){
        this.dataTeachers = new ArrayList<Teacher>();;
        this.dataStudents = new ArrayList<Student>();;
    }

    public DataBase(ArrayList<Teacher> dataTeachers, ArrayList<Student> dataStudents) {
        this.dataTeachers = dataTeachers;
        this.dataStudents = dataStudents;
    }

    public ArrayList<Teacher> getDataTeachers() {
        for(Teacher t:dataTeachers){
            System.out.print(t);}
        return null;
    }

    public void setDataTeachers(ArrayList<Teacher> dataTeachers) {
        this.dataTeachers = dataTeachers;
    }

    public ArrayList<Student> getDataStudents() {
        for(Student t:dataStudents){
            System.out.print(t);
        }
        return null;
    }

    public void setDataStudents(ArrayList<Student> dataStudents) {
        this.dataStudents = dataStudents;
    }

    public void addDataTeacher(Teacher teacher){
        dataTeachers.add(teacher);
    }

    public void addDataStudent(Student student){
        dataStudents.add(student);
    }
}
