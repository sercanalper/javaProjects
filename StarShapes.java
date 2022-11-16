/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class StarShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Please enter a number: ");
        n = input.nextInt();

        int space = n - 1;



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            space--;
        }

        space = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
            space++;
        }
    }
}