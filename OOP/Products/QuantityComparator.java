package OOP.Products;
/*
 Нарушений принципов SOLID не обнаружил
*/
import java.util.Comparator;
public class QuantityComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
