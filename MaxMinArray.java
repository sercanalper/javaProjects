/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int [] list = {15,12,788,1,-1,-788,2,0};

        System.out.println("The array is: " + Arrays.toString(list));

        int number;

        System.out.print("Please enter a number: ");
        number = input.nextInt();
        Arrays.sort(list);

        int min = list[0];
        int max = list[7];

        for (int i:list){
            if (i > min && i < number){
                min = i;
            }
            if (i < max && i > number){
                max = i;
            }

        }
        System.out.println("The closest smaller number: " + min);
        System.out.println("The closest bigger number: " + max);
    }
}
