package OOP.Students.Model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class User {
    private final String firstName;
    private final String lastName;
    private final Calendar birthDay;

    public User(String firstName, String lastName, GregorianCalendar birthDay) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthDay() {
        return birthDay;
    }
}