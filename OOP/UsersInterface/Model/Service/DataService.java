package OOP.UsersInterface.Model.Service;

import OOP.UsersInterface.Model.Data.User;

import java.util.ArrayList;
import java.util.Calendar;

public interface DataService<T extends User> {
    T create(int id, String firstName, String lastName, Calendar birthDay);
    ArrayList<T> getData();
}
