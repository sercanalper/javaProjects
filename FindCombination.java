/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class FindCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, subsofFirstandSecond = 1, combination, firstFactorial = 1, secondFactorial = 1;

        System.out.print("Please enter the bigger number: ");
        firstNumber = input.nextInt();

        System.out.print("Please enter the smaller number: ");
        secondNumber = input.nextInt();


        for (int i = 1; i <= firstNumber; i++){
            firstFactorial *= i;
        }

        for (int i = 1; i <= secondNumber; i++){
            secondFactorial *= i;
        }

        for (int i = 1; i <= (firstNumber - secondNumber); i++){
            subsofFirstandSecond *= i;
        }


        combination = firstFactorial / (secondFactorial * subsofFirstandSecond);
        System.out.println(combination);
    }

}

