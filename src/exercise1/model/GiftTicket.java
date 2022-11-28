package exercise1.model;

public class GiftTicket extends Ticket{

    public static final String TYPE = "gift";

    public GiftTicket(String event, Address address, double price, double discount) {
        super(event, address, price, discount);
    }

    @Override
    public String toString() {
        return super.toString() + ", typ : " + TYPE;
    }

    @Override
    public double calculatePrice() {
        return 1.05 * super.calculatePrice() + 5;
    }
}

