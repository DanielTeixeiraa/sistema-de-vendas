package Class;

public abstract class Person {
    String name;
    int cpf;
    String address;

    public abstract String getName();
    public abstract int getCpf();
    public abstract String getAddress();

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cpf=" + cpf + ", address=" + address + '}';
    }
    
    
    
    
}
