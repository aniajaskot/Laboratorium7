package exercise1.util;

import exercise1.model.*;
import java.util.Scanner;

public class TicketBuilder {
    private static Scanner scanner = new Scanner(System.in);

    public static String createTicketAndReturnInfo(){
        System.out.println("Wydarzenie:");
        String event = scanner.nextLine();
        System.out.println("Miasto wydarzenia: ");
        String city = scanner.nextLine();
        System.out.println("Ulica wydarzenia: ");
        String street = scanner.nextLine();
        System.out.println("Podaj cenę:");
        double price = scanner.nextDouble();
        System.out.println("Zniżka (0 - 1)");
        double discount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Typ biletu ("
                + OnlineTicket.TYPE + ", "
                + StandardTicket.TYPE + ", "
                + GiftTicket.TYPE + ")");
        String type = scanner.nextLine();

        switch (type){
            case OnlineTicket.TYPE:
                OnlineTicket onlineTicket2 = new OnlineTicket(event, new Address(city, street), price, discount);
                return onlineTicket2 + "\n" + onlineTicket2.calculatePrice();
            case GiftTicket.TYPE:
                GiftTicket giftTicket2 = new GiftTicket(event, new Address(city, street), price, discount);
                return giftTicket2 + "\n" + giftTicket2.calculatePrice();
            default:
                StandardTicket standardTicket2 = new StandardTicket(event, new Address(city, street), price, discount);
                return standardTicket2 + "\n" + standardTicket2.calculatePrice();
        }
    }


}

