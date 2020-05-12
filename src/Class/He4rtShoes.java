/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enum.TypeProduct;
import Factory.FactoryProduct;
import Interface.Product;
import Interface.Store;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class He4rtShoes implements Store {
    private String name = "He4rtShoes";

    FactoryProduct factoryProduct = new FactoryProduct();
    List<Product> listProduct = factoryProduct.createProduct(TypeProduct.STYLE);
    
    public He4rtShoes(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
   @Override
    public List<Product> getListProduct() {
        return listProduct;
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
    public void sellProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
