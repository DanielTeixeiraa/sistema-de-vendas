package Class;

import Interface.Product;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Product> lisCart = new ArrayList<>();
    private double cash;

    private Client(String name, int cpf, double cash, String address) {
        this.name = name;
        this.cpf = cpf;
        this.cash = cash;
        this.address = address;
    }

    public static class ClientBuilder {

        private String name;
        private int cpf;
        private String address;
        private double cash;

        public ClientBuilder() {
        }

        public ClientBuilder setNome(String name) {
            this.name = name;
            return this;
        }

        public ClientBuilder setCpf(int cpf) {
            this.cpf = cpf;
            return this;
        }

        public ClientBuilder setCash(double cash) {
            this.cash = cash;
            return this;
        }

        public ClientBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Client builder() {
            return new Client(name, cpf, cash, address);
        }

    }

    public List<Product> getLisCart() {
        return lisCart;
    }
    
    
    public void print(){
        System.out.println("-----Client-----");
        System.out.println("Name: "+name);
        System.out.println("Address :"+address);
        System.out.println("Cash: "+cash);
    }
    
    public void cart(Product product){
        lisCart.add(product);
    }
    

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCpf() {
        return this.cpf;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

}
