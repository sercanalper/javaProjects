/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

class PrimeRecursive {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if(isPrime(num, 2))
            System.out.println("It's Prime");
        else
            System.out.println("Not a prime");
    }
    static boolean isPrime(int n, int i) {

        if (n <= 2)
            return (n == 2) ? true : false;

        if (n % i == 0)
            return false;

        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }
}