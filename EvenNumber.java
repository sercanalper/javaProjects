/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0;


        do {
            System.out.println("Please enter a number: ");
            number = input.nextInt();

            if(number % 2 == 0 || number % 4 == 0 ){
                total += number;
            }
        }while (!(number % 2 == 1));

        System.out.println(total);
    }
}
