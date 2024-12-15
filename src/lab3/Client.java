package lab3;


public class Client {
    private String firstName;
    private String lastName;
    private Order order;

    public Client() {}

    public Client(String firstName, String lastName, Order order) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.order = order;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orderID=" + (order != null ? order.getOrderID() : "No order") +
                '}';
    }
}
