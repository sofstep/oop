package lab3;
import lab3.Order;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Menu pizza = new Menu(1, "Margarita", 10.25);
        Menu pizza1 = new Menu(2, "Peperoni", 11.25);
        Menu drink = new Menu(3, "Coca-cola", 5.15);
        Menu drink1 = new Menu(4, "Pepsi", 5.10);
        Menu potato = new Menu(5, "french fries", 9.00);
        Menu sauce = new Menu(6, "ketchup", 3.00);

        Client client = new Client("Philip", "Fry", new Order(1, null, Arrays.asList(pizza, drink1)));

        client.getOrder().setClient(client);
        System.out.println(client.getOrder());

        Administrator admin = new Administrator("Alice");
        admin.confirmOrder(client.getOrder());

        System.out.println("\n--- Receipt ---");
        System.out.println(client.getOrder());
    }
}
