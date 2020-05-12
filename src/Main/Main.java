package Main;

import Class.Client;
import Class.Electronic;
import Class.Seller;
import Enum.TypeProduct;
import Enum.TypeStore;
import Factory.FactoryProduct;
import Factory.FactoryStore;
import Interface.Product;
import Interface.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FactoryProduct factoryProduct = new FactoryProduct();
        List<Store> storeList = new ArrayList<>();
        Operations operations = new Operations();
        List<Product> product = factoryProduct.createProduct(TypeProduct.ELECTRONIC);
        List<Product> product1 = factoryProduct.createProduct(TypeProduct.HOME);
        List<Product> product2 = factoryProduct.createProduct(TypeProduct.STYLE);
        Store s1 = FactoryStore.createStore(TypeStore.HE4RT_X, product); storeList.add(s1);
        Store s2 = FactoryStore.createStore(TypeStore.HE4RT_HOUSES, product1); storeList.add(s2);
        Store s3 = FactoryStore.createStore(TypeStore.HE4RT_SHOES, product2); storeList.add(s3);
        
        Client c1 = new Client.ClientBuilder()
                .setNome("Daniel")
                .setCpf(111)
                .setCash(5000)
                .setAddress("Brasil").builder();
        Seller seller1 = new Seller.SellerBuilder()
                .setNome("Andre")
                .setCpf(222)
                .setAddress("Brasil").builder();
        
        c1.print();
        seller1.print();
        
        operations.operations(c1, storeList);
        operations.cart(c1);

    }

}
