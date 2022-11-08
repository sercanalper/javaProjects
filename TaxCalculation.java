/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        System.out.println("Hello ! Please enter price as tax excluded: ");
        try (Scanner tax_excluded = new Scanner(System.in)) {
            int a = tax_excluded.nextInt();

            System.out.println("Please enter the tax ratio: ");
            try (Scanner tax_ratio = new Scanner(System.in)) {
                double b = tax_ratio.nextDouble();

                double amount_with_tax;
                amount_with_tax = (a * b) + (a);

                System.out.println("The price is " + amount_with_tax + " as tax included");
            }
        }


    }
}