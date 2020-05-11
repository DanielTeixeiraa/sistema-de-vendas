package Class;

import Interface.Product;
import java.util.List;

public class Style implements Product {

    private String name;
    private int id;
    private double price;

    private Style(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }


   public static class StyleBuilder{
    private String name;
    private int id;
    private double price;
    
     public StyleBuilder(){
        
    }

    public StyleBuilder nome(String nome){
        this.name  = nome;
        return this;
    }
    public StyleBuilder id(int id){
        this.id  = id;
        return this;
    }
    public StyleBuilder price(double price){
        this.price  = price;
        return this;
    }
    public Style builder(){
        return new Style(name,id,price);
    
    }
    }

    @Override
    public String toString() {
        return "Style{" + "name=" + name + ", price=" + price + '}';
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
    @Override
    public double getPrice() {
        return price;
    }

}
