/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class TakingPower {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int x, y, total = 1;

        System.out.print("Please enter the bottom number: ");
        x = input.nextInt();

        System.out.print("Please enter the upper number: ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++){
            total *= x;
        }

        System.out.println("The answer is " + total);
    }
}
