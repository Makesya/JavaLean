package OOP.Students.Model;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Teacher extends User {
    private final ArrayList<String> discipline = new ArrayList<>();
    private double rating;
    private final ArrayList<String> department = new ArrayList<>();
    private static int teacherId = 0;



    public Teacher(String firstName, String lastName, GregorianCalendar birthDay) {
        super(firstName, lastName, birthDay);
        teacherId++;
    }

    public ArrayList<String> getDiscipline() {
        return discipline;
    }
    public double getRating() {
        return rating;
    }
    public ArrayList<String> getDepartment() {
        return department;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Преподаватель: Имя: %s\nФамилия: %s\nДисциплины: %s\nРейтинг: %f\n\n",
                getFirstName(), getLastName(), getDiscipline(), getRating() );
    }
}
