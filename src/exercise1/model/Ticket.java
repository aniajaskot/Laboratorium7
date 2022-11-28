package exercise1.model;

public class Ticket {

    private static int uniqueSequence = 1000;

    private int id;
    private String event;
    private Address address;
    private double price;
    private double discount;

    public Ticket(String event, Address address, double price, double discount) {
        this.id = uniqueSequence++;
        this.event = event;
        this.address = address;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Ticket" +
                "id=" + id +
                ", event='" + event +
                ", address=" + address +
                ", price=" + price +
                ", discount=" + discount;
    }

    public double calculatePrice(){
        return price - (price * discount);
    }
}
