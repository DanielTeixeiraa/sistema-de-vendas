package sistemadevendas;

import Class.Client;
import Class.Electronic;
import Class.Seller;
import Enum.TypeProduct;
import Enum.TypeStore;
import Factory.FactoryProduct;
import Factory.FactoryStore;
import Interface.Product;
import Interface.Store;
import java.util.List;

public class SistemaDeVendas {

    public static void main(String[] args) {
        FactoryProduct factoryProduct = new FactoryProduct();
        List<Product> product = factoryProduct.createProduct(TypeProduct.ELECTRONIC);
        List<Product> product1 = factoryProduct.createProduct(TypeProduct.HOME);
        List<Product> product2 = factoryProduct.createProduct(TypeProduct.STYLE);
        Store s1 = FactoryStore.createStore(TypeStore.HE4RT_X, product);
        Store s2 = FactoryStore.createStore(TypeStore.HE4RT_HOUSES, product1);
        Store s3 = FactoryStore.createStore(TypeStore.HE4RT_SHOES, product2);
        s1.showProduct();
        s2.showProduct();
        s3.showProduct();

        Client c1 = new Client.ClientBuilder()
                .setNome("Daniel")
                .setCpf(111)
                .setCash(1000)
                .setAddress("Brasil").builder();
        Seller seller1 = new Seller.SellerBuilder()
                .setNome("Andre")
                .setCpf(222)
                .setAddress("Brasil").builder();
        
        c1.print();
        seller1.print();

    }

}
