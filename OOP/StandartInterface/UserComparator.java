package OOP.StandartInterface;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

    @Override
    public Comparator<T> reversed() {
        return Comparator.super.reversed();
    }

}
