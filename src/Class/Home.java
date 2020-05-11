package Class;

import Interface.Product;
import java.util.List;

public class Home implements Product {

    private String name;
    private int id;
    private double price;

    private Home(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public static class HomeBuilder {

        private String name;
        private int id;
        private double price;

        public HomeBuilder() {

        }

        public HomeBuilder nome(String nome) {
            this.name = nome;
            return this;
        }

        public HomeBuilder id(int id) {
            this.id = id;
            return this;
        }

        public HomeBuilder price(double price) {
            this.price = price;
            return this;
        }

        public Home builder() {
            return new Home(name, id, price);

        }
    }

    @Override
    public String toString() {
        return "Home{" + "name=" + name + ", price=" + price + '}';
    }

 

    @Override
    public double getPrice() {
        return price;
    }

 @Override
    public void showProduct(List<Product> product) {
        for (int i = 0; i < product.size();) {
            System.out.println(product.get(i));
            i++;

        }
    }

    @Override
    public void sellProduct() {
    }

    @Override
    public String getName() {
        return name;
    }

}
