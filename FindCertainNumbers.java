/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class FindCertainNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, increment = 0;
        double total = 0, finalTotal;
        System.out.println("Please enter a number: ");
        number = input.nextInt();

        for (int i = 0; i  < number; i++){
            if (i % 3 == 0 || i % 4 == 0){
                total += i;
                increment++;
            }
        }
        finalTotal = (total/increment);
        System.out.println("the " + finalTotal);
    }
}
