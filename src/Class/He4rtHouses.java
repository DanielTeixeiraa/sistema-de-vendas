
package Class;

import Enum.TypeProduct;
import Factory.FactoryProduct;
import Interface.Product;
import Interface.Store;
import java.util.ArrayList;
import java.util.List;

public class He4rtHouses implements Store {
    private String name = "He4rtHouses";
    
    FactoryProduct factoryProduct = new FactoryProduct();
    List<Product> listProduct = factoryProduct.createProduct(TypeProduct.HOME);

    public He4rtHouses(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
    
    @Override
    public String getNome() {
        return name;
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < listProduct.size();) {
            System.out.println(listProduct.get(i));
            i++;

        }
    }

   @Override
    public List<Product> getListProduct() {
        return listProduct;
    }

    @Override
    public void sellProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
