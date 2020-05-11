package Interface;

import java.util.List;

public interface Product {
    public void showProduct(List<Product> product);
    public void sellProduct();
    public String getName();
    public double getPrice();
}
