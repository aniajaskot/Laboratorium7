package exercise1.model;

public class OnlineTicket extends Ticket{

    public static final String TYPE = "online";

    public OnlineTicket(String event, Address address, double price, double discount) {
        super(event, address, price, discount);
    }

    @Override
    public String toString() {
        return super.toString() + ", typ : " + TYPE;
    }

    // tej metody mogłoby tu nie być
    // poniewać nie nadpisuje (nie zmienia) implementacji
    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }
}
