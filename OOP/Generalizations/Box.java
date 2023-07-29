package OOP.Generalizations;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List items = new ArrayList();

    public List getItems() {
        return items;
    }

    public void addItem(Object item) {
        items.add(item);
    }

//Constructor
    public Box(List items) {
        for (Object item:items) {
            if (item instanceof Fructs) {
                this.items = items;
            }
        }

    }
    //ToString

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
