package lab3;
import java.util.List;


public class Order {
    private int orderID;
    private Client client;
    private List<Menu> items;

    public Order() {}

    public Order(int orderID, Client client, List<Menu> items) {
        this.orderID = orderID;
        this.client = client;
        this.items = items;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Menu> getItems() {
        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Menu::getPrice).sum();
    }
    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order{" +
                "orderID=" + orderID +
                ", client=" + (client != null ? client.getFirstName() + " " + client.getLastName() : "No client") +
                ", items=\n");

        if (items != null && !items.isEmpty()) {
            for (Menu item : items) {
                orderDetails.append("- ").append(item).append("\n");
            }
        } else {
            orderDetails.append("No items in the order.\n");
        }

        orderDetails.append("Total: $").append(calculateTotal()).append("\n}");
        return orderDetails.toString();
    }

}
