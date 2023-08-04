package OOP.UsersInterface.Model.Service;

import OOP.UsersInterface.Model.Data.User;

import java.util.ArrayList;
import java.util.Calendar;

public class UserService <T extends  User> implements DataService<T>{
    @Override
    public T create(int id, String firstName, String lastName, Calendar birthDay) {
        return null;
    }

    @Override
    public ArrayList<T> getData() {
        return null;
    }
}
