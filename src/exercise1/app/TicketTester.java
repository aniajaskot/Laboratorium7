package exercise1.app;

import exercise1.model.*;
import exercise1.util.TicketBuilder;

public class TicketTester {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "Plac Grunwaldzki");
        OnlineTicket onlineTicket = new OnlineTicket("Szkolenie", address, 100, 0.2);
        System.out.println(onlineTicket);
        double onlinePrice = onlineTicket.calculatePrice();
        System.out.println(onlinePrice);

        StandardTicket standardTicket = new StandardTicket("Szkolenie2", address, 100, 0.2);
        System.out.println(standardTicket);
        double standardPrice = standardTicket.calculatePrice();
        System.out.println(standardPrice);

        GiftTicket giftTicket = new GiftTicket("Szkolenie3", address, 100, 0.2);
        System.out.println(giftTicket);
        double giftPrice = giftTicket.calculatePrice();
        System.out.println(giftPrice);

        System.out.println(TicketBuilder.createTicketAndReturnInfo());


    }
}
