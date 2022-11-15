/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class NumbersPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, foursPower, fivesPower;
        int total = 0;

        System.out.println("Please enter a number: ");
        number = input.nextDouble();

        for(int i = 0; i <= number; i++){

            foursPower = Math.pow( 4, total);
            if (foursPower <= number)
                System.out.println(foursPower + " is " + total + ". power of 4" );

            fivesPower = Math.pow( 5, total);
            if (fivesPower <= number)
                System.out.println(fivesPower + " is " + total + ". power of 5" );
            total ++;
        }
    }
}