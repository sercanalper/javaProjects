/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class AdvancedCalculator {

    static int sum (int a, int b){
        int result = a + b;
        System.out.println("The sum is " + result);
        return result;
    }

    static int subtraction (int a, int b){
        int result = a - b;
        System.out.println("The subtraction is " + result);
        return result;
    }

    static int multiplication (int a, int b){
        int result = a * b;
        System.out.println("The multiplication is " + result);
        return result;
    }

    static int division (int a, int b){
        if (b == 0) {
            System.out.println("The divider cannot be 0. Please try again.");
            return 0;
        }

        int result = a / b;
        System.out.println("The division is " + result);
        return result;
    }

    static int power (int a, int b){
        int something = 1;
        for (int i = 1; i <= b; i++){
            something *= a;
        }
        System.out.println("The " + b + ". power of  " + a + " is " + something);
        return something;
    }

    static int factorial (int a){
        int something = 1;
        for (int i = 1; i <= a; i++){
            something *= i;
        }
        System.out.println("The factorial of  " + a + " is " + something);
        return something;
    }

    static int mod (int a, int b){
        int result = a % b;
        System.out.println("The modulo is " + result);
        return result;
    }
    static void rectangle (int a, int b){
        System.out.println("Perimeter is " + 2 * (a + b));
        System.out.println("Area is " + (a * b));
    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Sum Operation\n" +
                "2- Subtraction Operation\n" +
                "3- Multiplier Operation\n" +
                "4- Division Operation\n" +
                "5- Take Power\n" +
                "6- Take Factorial\n" +
                "7- Take Modulo\n" +
                "8- Calculate Area and Perimeter of a Rectangle\n" +
                "0- Exit";

        System.out.println("Welcome to Advanced Calculator !");
        System.out.println("---------------------------------");
        System.out.println(menu);
        System.out.println("---------------------------------");

        while (true){

            System.out.print("Please choose an operation: " +
                    "If you want to take a factorial, please enter 0 for second number: ");
            select = input.nextInt();
            if(select == 0) break;

            System.out.println("Please enter a number: ");
            int a = input.nextInt();

            System.out.println("Please enter second number: ");
            int b = input.nextInt();

            if(select == 0) break;

            switch (select){
                case 1 :
                    sum(a, b);
                    break;
                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Please enter a valid value: ");
            }
        }
    }
}



