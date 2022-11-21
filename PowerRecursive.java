/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class PowerRecursive {
    static int power (int a, int b){
        if (b != 0)
            return a * power(a, (b - 1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("Please enter first number: ");
        a = input.nextInt();

        System.out.println("Please enter second number: ");
        b = input.nextInt();

        System.out.println("-----------------------------");
        System.out.println("The result is " + power(a, b) );
    }
}
