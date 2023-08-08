package OOP.Students.Model;
import java.util.GregorianCalendar;

public class Student extends User {
    private String group;
    private String specialization;
    private double middleBall;
    private static int studentId = 0;

    public Student(String firstName, String lastName, GregorianCalendar birthDay, String group, String specialization, double middleBall) {
        super(firstName, lastName, birthDay);
        this.group = group;
        this.specialization = specialization;
        this.middleBall = middleBall;
        studentId++;
    }

    public Student(String firstName, String lastName, GregorianCalendar birthDay) {
        super(firstName, lastName, birthDay);
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getMiddleBall() {
        return middleBall;
    }
    public void setMiddleBall(double middleBall) {
        this.middleBall = middleBall;
    }


    @Override
    public String toString() {
        return String.format("Студент: Имя: %s\nФамилия: %s\nГруппа: %s\nСредний балл: %f\n\n",
                getFirstName(), getLastName(), getGroup(), getMiddleBall());
    }
}

