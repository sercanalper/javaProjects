/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class RecursiveFibonacci {

    static int fib (int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        System.out.println(fib(number));
    }
}
