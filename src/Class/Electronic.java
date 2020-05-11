package Class;

import Interface.Product;
import java.util.List;

public class Electronic implements Product {

    private String name;
    private int id;
    private double price;

    private Electronic(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public void showProduct(List<Product> product) {
        for (int i = 0; i < product.size();) {
            System.out.println(product.get(i));
            i++;

        }
    }

    public static class ElectronicBuilder {

        private String name;
        private int id;
        private double price;

        public ElectronicBuilder() {

        }

        public ElectronicBuilder nome(String nome) {
            this.name = nome;
            return this;
        }

        public ElectronicBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ElectronicBuilder price(double price) {
            this.price = price;
            return this;
        }

        public Electronic builder() {
            return new Electronic(name, id, price);

        }
    }

    @Override
    public String toString() {
        return "Electronic{" + "name=" + name + ", price=" + price + '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void sellProduct() {
    }

}
