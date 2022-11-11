/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class CalculationMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber;
        int operator;


        System.out.println("Please enter the First Number: ");
        firstNumber = input.nextDouble();

        System.out.println("Please enter the Second Number: ");
        secondNumber = input.nextDouble();

        System.out.println("Please enter the number of the operator: ");
        System.out.println("1 for Addition (+)\n2 for Subtraction (-)\n3 for Multiplication (*)\n4 for Division (/)");
        operator = input.nextInt();

        switch (operator) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;

            case 2:
                System.out.println(firstNumber - secondNumber);
                break;

            case 3:
                System.out.println(firstNumber * secondNumber);
                break;

            case 4:
                if (secondNumber == 0) {
                    System.out.println("A number can not divide by 0 ! Please enter another number.");
                }else
                    System.out.println(firstNumber / secondNumber);
                break;

            default:
                System.out.println("You enter wrong value, please try again.");

        }
    }
}
