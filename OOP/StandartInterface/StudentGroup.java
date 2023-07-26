package OOP.StandartInterface;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private ArrayList<Student> studentList;

    public StudentGroup(ArrayList<Student> studentList) {
        this.studentList = studentList;}

    public ArrayList<Student> getStudentList() {
        return studentList;}

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;}
}
