/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, travelType, age;
        boolean noError;
        double ticketPrice = 0, ageDiscount, amongTwelveTwenty, discountPrice, roundTripDiscount = 0, finalTicketPrice;

        System.out.println("Welcome to XXX Flight Website ! Please enter the distance (as km) you want to go: ");
        distance = input.nextInt();

        if (distance >= 0){

            ticketPrice = distance * 0.1;
            System.out.println("Please enter your travel type.\nIf you want to travel one way, enter '1'\nIf you want to travel round-trip, enter '2' ");
            travelType = input.nextInt();

            if (travelType == 1 || travelType == 2){

                System.out.println("Please enter your age: ");
                age = input.nextInt();

                if (age >= 0 && age < 12){

                    ageDiscount = ticketPrice * 0.5;
                    discountPrice = ticketPrice - ageDiscount;

                    if (travelType == 1){

                        System.out.println("Your Ticket Price is " + discountPrice);

                    } else
                        roundTripDiscount = discountPrice * 0.2;
                        finalTicketPrice = (discountPrice - roundTripDiscount) * 2;

                        System.out.println("Your Ticket Price is " + finalTicketPrice);

                } else if (age >= 12 && age <= 24) {

                    ageDiscount = ticketPrice * 0.1;
                    discountPrice = ticketPrice - ageDiscount;

                    if (travelType == 1){

                        System.out.println("Your Ticket Price is " + discountPrice);

                    } else
                        roundTripDiscount = discountPrice * 0.2;
                        finalTicketPrice = (discountPrice - roundTripDiscount) * 2;

                        System.out.println("Your Ticket Price is " + finalTicketPrice);

                } else if (age >= 24 && age <= 64) {

                    if (travelType == 1){

                        System.out.println("Your Ticket Price is " + ticketPrice);

                    } else
                        roundTripDiscount = ticketPrice * 0.2;
                        finalTicketPrice = (ticketPrice - roundTripDiscount) * 2;

                        System.out.println("Your Ticket Price is " + finalTicketPrice);

                }  else if (age >= 65) {

                    ageDiscount = ticketPrice * 0.3;
                    discountPrice = ticketPrice - ageDiscount;

                    if (travelType == 1){

                        System.out.println("Your Ticket Price is " + discountPrice);

                    } else
                        roundTripDiscount = discountPrice * 0.2;
                        finalTicketPrice = (discountPrice - roundTripDiscount) * 2;

                        System.out.println("Your Ticket Price is " + finalTicketPrice);

                } else
                    System.out.println("You enter wrong value. Please try again.");

            } else
                System.out.println("You enter wrong value. Please try again.");

        } else
            System.out.println("You enter wrong value. Please try again.");
    }
}