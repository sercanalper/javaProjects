/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Please enter the length of the array: ");
        number = input.nextInt();

        int [] arr = new int [number];

        for (int i = 0; i < number; i++){
            System.out.print("Please enter a number for the array: ");
            int element = input.nextInt();
            arr [i] = element;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


