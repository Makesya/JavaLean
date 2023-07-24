package OOP.Products;

import java.util.ArrayList;
import java.util.List;

public class AutomatHotBevearage extends Automate {
    List<HotBeverage> listProduct = new ArrayList<>();

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
