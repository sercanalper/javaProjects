/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class GreenGrocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5, totalPrice, pearKG, appleKG, tomatoKG, bananaKG, eggplantKG;

        System.out.println("Please enter how many kg pear do you want ? ");
        pearKG = input.nextDouble();

        System.out.println("Please enter how many kg apple do you want ? ");
        appleKG = input.nextDouble();

        System.out.println("Please enter how many kg tomato do you want ? ");
        tomatoKG = input.nextDouble();

        System.out.println("Please enter how many kg banana do you want ? ");
        bananaKG = input.nextDouble();

        System.out.println("Please enter how many kg eggplant do you want ? ");
        eggplantKG = input.nextDouble();

        totalPrice = (pearPrice*pearKG) + (applePrice*appleKG) + (tomatoPrice*tomatoKG) + (bananaPrice*bananaKG) + (eggplantPrice*eggplantKG);
        System.out.println("Total price is: " + totalPrice + " TL");


    }
}
