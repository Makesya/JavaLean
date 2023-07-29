package OOP.Generalizations;

import java.util.List;

public class GenericBox<T extends Fructs> implements Comparable<GenericBox<?>>{
    private final List<T> listofItems;
    public GenericBox(List<T> listofItems) {
        this.listofItems = listofItems;}

    public List<T> getListofItems() {
        return listofItems;}

    public void addListofItems(T item) {
        this.listofItems.add(item);}

    @Override
    public String toString() {
        return "GenericBox" + listofItems;}

    public double getWeight(){
        double totalWeight = 0;
        for (T item:listofItems){
            totalWeight+= item.getWeight();}
        return  totalWeight;}


    @Override
    public int compareTo(GenericBox<? extends Fructs> o) {
        return (int) (getWeight() - o.getWeight());
    }
}
