/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.println("Please enter a number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (number == total)
            System.out.println(number + " is a PERFECT NUMBER !!!");
        else
            System.out.println(number + " is not a perfect number.");
    }
}
