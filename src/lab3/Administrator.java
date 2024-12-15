package lab3;

public class Administrator {
    private String Name;

    public Administrator() {}
    public Administrator(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public void confirmOrder(Order order) {
        System.out.println("Administrator " + Name + " confirmed the order:");
        System.out.println(order);
    }
}
