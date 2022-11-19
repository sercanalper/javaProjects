/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */


import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, n, nMax = -2147483648, nMin = 2147483647;

        System.out.print("How many number dou you want to enter ? ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.print("Please enter " + i + ". number: ");
            n = input.nextInt();


            if (n > nMax)
                nMax = n;
            if (n < nMin)
                nMin = n;

        }

        System.out.println(" ");
        System.out.println("The maximum number is " + nMax);
        System.out.println(" ");
        System.out.println("The minimum number is " + nMin);
    }
}
