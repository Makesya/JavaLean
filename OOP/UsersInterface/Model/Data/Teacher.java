package OOP.UsersInterface.Model.Data;

import java.util.ArrayList;
import java.util.Calendar;

public class Teacher extends User{
    private ArrayList<String> discipline;
    private double rating;
    private ArrayList<String> departament;
    private static int teacherId = 0;

    public Teacher(String firstName, String lastName, Calendar birthDay, ArrayList<String> discipline, double rating, ArrayList<String> department) {
        super(firstName, lastName, birthDay);
        this.discipline = discipline;
        this.rating = rating;
        this.departament = department;
        teacherId++;
    }

    public ArrayList<String> getDiscipline() {
        return discipline;
    }
    public double getRating() {
        return rating;
    }
    public ArrayList<String> getDepartament() {
        return departament;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Преподаватель: Имя: %s\nФамилия: %s\nДисциплины: %s\nРейтинг: %f",
                getFirstName(), getLastName(), getDiscipline(), getRating() );
    }
}
