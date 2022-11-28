package exercise1.model;

public class StandardTicket extends Ticket{

    public static final String TYPE = "standard";

    public StandardTicket(String event, Address address, double price, double discount) {
        super(event, address, price, discount);
    }

    @Override
    public String toString() {
        return super.toString() + ", typ : " + TYPE;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 5;
    }
}

