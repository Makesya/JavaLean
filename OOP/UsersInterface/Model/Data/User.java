package OOP.UsersInterface.Model.Data;

import java.util.Calendar;

public abstract class User {
    private String firstName;
    private String lastName;
    private Calendar birthDay;

    public User(String firstName, String lastName, Calendar birthDay) {
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
