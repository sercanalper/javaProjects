/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class GcdandLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, i;

        System.out.print("Please enter first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println(" ");

        i = num1;

        do {
            i--;
        } while (!(num1 % i == 0 && num2 % i == 0));

        System.out.println("The greatest common divisor is " + i);


        System.out.println(" ");


        do {
            i++;
        } while (!(i % num1 == 0 && i % num2 == 0));

        System.out.println("The least common multiple is " + i);

    }
}
