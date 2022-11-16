/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double sum = 0;

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++){
            sum += (1/i);
        }

        System.out.println("The harmonic number is " + sum);
    }
}
