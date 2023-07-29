package OOP.Products;

import OOP.Abstracts.Order;

import java.util.ArrayList;
import java.util.List;

public class Automate implements AutoInterface{

  List<Product> listProduct = new ArrayList<>();

  public void initProduct(List<Product> myList) {
    listProduct = myList;
  }

  public Product getProduct(String name) {
    for (Product el : listProduct) {
      if (el.getName().equals(name)) {
        return el;
      }
    }
    return null;

  }

  public Order createOrder(List<String> mylist){

    return null;
  }

  @Override
  public void addProduct(Product product) {
    this.listProduct.add(product);
  }

  @Override
  public String toString() {
    return "Automate: "  + listProduct;
  }
}
