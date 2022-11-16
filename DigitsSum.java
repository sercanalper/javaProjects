/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int basValue, sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            sum += basValue;
            tempNumber /= 10;
        }
        System.out.println("The sum of the digits of the number is "+ sum);
    }
}
