/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class GetOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.println("Please enter first number: ");
        a = input.nextDouble();

        System.out.println("Please enter second number: ");
        b = input.nextDouble();

        System.out.println("Please enter third number: ");
        c = input.nextDouble();

        if (a < b && a < c){
            if (b < c){
                System.out.println("The number order from smallest to biggest is " + a + " " + b + " " + c);
            } else if (c < b){
                System.out.println("The number order from smallest to biggest is " + a + " " + c + " " + b);
            }
        }else if (b < a && b < c){
            if (a < c){
                System.out.println("The number order from smallest to biggest is " + b + " " + a + " " + c);
            } else if (c < a){
                System.out.println("The number order from smallest to biggest is " + b + " " + c + " " + a);
            }
        }else if (c < a && c < b){
            if (a < b){
                System.out.println("The number order from smallest to biggest is " + c + " " + a + " " + b);
            } else if (b < a){
                System.out.println("The number order from smallest to biggest is " + c + " " + b + " " + a);
            }
        }
    }
}
