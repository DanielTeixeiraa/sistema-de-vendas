package Factory;

import Class.Electronic;
import Class.Home;
import Class.Style;
import Enum.TypeProduct;
import Interface.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactoryProduct {
    Scanner scan = new Scanner(System.in);
    public List<Product> createProduct(TypeProduct type) {
        List<Product> listProduct = new ArrayList<>();
        switch (type) {
            case ELECTRONIC:
                listProduct.add(new Electronic.ElectronicBuilder().nome("fone").id(1).price(1000).builder());
                listProduct.add(new Electronic.ElectronicBuilder().nome("radio").id(2).price(1000).builder());
                return listProduct;
            case STYLE:
                listProduct.add(new Style.StyleBuilder().nome("Jordan").id(3).price(1000).builder());
                listProduct.add(new Style.StyleBuilder().nome("Nike").id(4).price(1000).builder());
                return listProduct;
            case HOME:
                listProduct.add(new Home.HomeBuilder().nome("Monster").id(5).price(3000).builder());
                listProduct.add(new Home.HomeBuilder().nome("Agua").id(6).price(2000).builder());
                return listProduct;
            default:
                return null;

        }
    }
    
    
    
    
    
    
    
    
}
