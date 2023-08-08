package OOP.Products;
/*
 Нарушений принципов SOLID не обнаружил
 Класс AutomatHotBevearage и методы в нем отвечают только за автомат горчих напитков
*/
import java.util.ArrayList;
import java.util.List;

public class AutomatHotBevearage extends Automate {
    List<HotBeverage> listProduct = new ArrayList<>();
    /**
     * Метод иницилизирует список горячих напитков в автомат
     **/
    public void initHotBeverage(List<HotBeverage> myList) {
      listProduct = myList;
    }

  public HotBeverage getProduct(String name) {
    for (HotBeverage el : listProduct) {
      if (el.getName().equals(name)) {
        return (HotBeverage) el;
      }
    }
    return null;

  }
}
