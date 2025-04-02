package oops;

interface Order {
    String getName();
    double getPrice();
    void placeOrder();
}

class Food implements Order {
    private double price;
    private String name;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing order: " + this.toString());
        System.out.println("Price of " + name + ": " + price);
    }

    @Override
    public String toString() {
        return name + " - Price: " + price;
    }
}

class Beverages implements Order {

    private double price;
    private String name;

    public Beverages(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing order: " + this.toString());
        System.out.println("Price of " + name + ": " + price);
    }

    @Override
    public String toString() {
        return name + " - Price: " + price;
    }
}

class Hotel {

    private double totalAmount = 0.0;

    public void addOrder(Order o) {
        o.placeOrder();  
        totalAmount += o.getPrice();
    }

    public void calculateTotal() {
        System.out.println("Total amount for the order: " + totalAmount);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        Order food = new Food("Pizza", 10.50);
        Order bev = new Beverages("Coke", 3.75);

        h.addOrder(food);
        h.addOrder(bev);

        h.calculateTotal();
    }
}
