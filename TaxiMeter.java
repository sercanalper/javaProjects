/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double taxiFee, km;
        System.out.println("Please Enter How Many Kilometer has been done");
        km = input.nextDouble();

        taxiFee = 10 + (km * 2.20);

        if (taxiFee <= 20){
            System.out.println("Your fee is 20 TL");
        } else {
          System.out.println("Your fee is " + taxiFee + " TL.");
            }
        }
    }