/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class Find_Hypotenuse_Perimeter_Area {
    public static void main(String[] args) {
        int a, b;
        double c, d, e;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the horizontal length: ");
        a = input.nextInt();

        System.out.println("Please enter the upright length: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("The hypotenuse has been set as: " + c);

        d = (a + b + c);
        System.out.println("The perimeter has been set as: " + d);

        e =  (a * b) / 2;
        System.out.println("The area has been set as: " + e);
    }
}