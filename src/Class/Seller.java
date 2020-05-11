/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author User
 */
public class Seller extends Person {

    private Seller(String name, int cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public static class SellerBuilder {

        private String name;
        private int cpf;
        private String address;

        public SellerBuilder() {
        }

        public SellerBuilder setNome(String name) {
            this.name = name;
            return this;
        }

        public SellerBuilder setCpf(int cpf) {
            this.cpf = cpf;
            return this;
        }

        public SellerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Seller builder() {
            return new Seller(name, cpf, address);
        }

    }

    public void print(){
        System.out.println("-----Seller-----");
        System.out.println("Name: "+name);
        System.out.println("Address :"+address);
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
