
package Class;

import Interface.Product;
import Interface.Store;
import java.util.ArrayList;
import java.util.List;

public class He4rtHouses implements Store {
    private List<Product> listProduct;

    public He4rtHouses(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
    
    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < listProduct.size();) {
            System.out.println(listProduct.get(i));
            i++;

        }
    }

    @Override
    public void sellProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
