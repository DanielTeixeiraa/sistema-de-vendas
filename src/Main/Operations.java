package Main;

import Class.Client;
import Class.Seller;
import Interface.Product;
import Interface.Store;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operations {

    static int quit;
    Product p;
    List<Product> x;
    Scanner scan = new Scanner(System.in);
    List<Product> cartList;
    static int choice;
    Store store;

    public void cart(Client client) {
        System.out.println("Seu carrinho:");
        client.getLisCart();
        for (Product pc : client.getLisCart()) {
            System.out.println(pc);
        }
    }

    public void operations(Client client, List<Store> listStore) {
        while (true) {
            choiceStore(listStore);
            buy(client, listStore);
            quit = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (quit == JOptionPane.NO_OPTION) {
                break;
            } else if (quit == JOptionPane.YES_OPTION) {

            } else {
                break;
            }
        }

    }

    public void choiceStore(List<Store> listStore) {
        try {
            System.out.println("Escolha a loja que deseja realizar compras");
            for (Store store : listStore) {
                System.out.println(store.getNome());
            }
            int c = scan.nextInt();
            switch (c) {
                case 1:
                    store = listStore.get(0);
                    x = listStore.get(0).getListProduct();
                    break;
                case 2:
                    store = listStore.get(1);
                    x = listStore.get(1).getListProduct();
                    break;
                case 3:
                    store = listStore.get(2);
                    x = listStore.get(2).getListProduct();
                    break;
                default:
                    System.out.println("Numero invalido");
                    scan.nextLine();
                    choiceStore(listStore);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Caracter invalido");
            scan.nextLine();
            choiceStore(listStore);
        }
    }

    public void buy(Client client, List<Store> listStore) {
        System.out.println("BEM VINDO A " + store.getNome());
        System.out.println("---------------------");
        System.out.println("Temos a seguinte lista de produtos:");
        choiceProduct(client, listStore);
        confirmBuy(client);
    }

    public void confirmBuy(Client client) {
        if (choice == 1 && client.getCash() >= x.get(0).getPrice()) {
            System.out.println("Voce comprou: " + x.get(0).getName());
            client.setCash(client.getCash() - x.get(0).getPrice());
            client.cart(x.get(0));
        } else if (choice == 2 && client.getCash() >= x.get(1).getPrice()) {
            System.out.println("Voce comprou: " + x.get(1).getName());
            client.setCash(client.getCash() - x.get(1).getPrice());
            client.cart(x.get(1));
        } else if (choice == 3 && client.getCash() >= x.get(2).getPrice()) {
            System.out.println("Voce comprou: " + x.get(2).getName());
            client.setCash(client.getCash() - x.get(2).getPrice());
            client.cart(x.get(2));
        } else {
            System.out.println("Voce nao tem dinheiro suficiente");
        }
    }

    public void choiceProduct(Client client, List<Store> listStore) {
        System.out.println("Deseja comprar qual? (4- para voltar as lojas)");
        try {
            store.showProduct();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    p = store.getListProduct().get(0);
                    break;
                case 2:
                    p = store.getListProduct().get(0);
                    break;
                case 4:
                    operations(client, listStore);
                    break;
                default:
                    System.out.println("Escolha um numero disponivel");
                    choiceProduct(client, listStore);
                    scan.nextLine();
            }
        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.out.println("Caracter Indisponivel");
            scan.nextLine();
            choiceProduct(client, listStore);

        }

    }

}
