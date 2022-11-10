/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class BodyIndexCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, height, bodyIndex;

        System.out.println("Please enter the weight: ");
        weight = input.nextDouble();

        System.out.println("Please enter the height: ");
        height = input.nextDouble();

        bodyIndex = weight / (height * height);
        System.out.println("Your Body Index is " + bodyIndex);
    }
}