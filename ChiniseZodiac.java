/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class ChiniseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bornYear, findZodiac;

        System.out.println("To learn your Chinese Zodiac, please enter your birth year: ");
        bornYear = input.nextInt();
        findZodiac = bornYear % 12;

        if (bornYear >= 0 && bornYear <= 2500){
            switch (findZodiac) {
                case 0:
                    System.out.println("Monkey");
                    break;
                case 1:
                    System.out.println("Cockerel");
                    break;
                case 2:
                    System.out.println("Dog");
                    break;
                case 3:
                    System.out.println("Pig");
                    break;
                case 4:
                    System.out.println("Mice");
                    break;
                case 5:
                    System.out.println("Ox");
                    break;
                case 6:
                    System.out.println("Tiger");
                    break;
                case 7:
                    System.out.println("Rabbit");
                    break;
                case 8:
                    System.out.println("Dragon");
                    break;
                case 9:
                    System.out.println("Snake");
                    break;
                case 10:
                    System.out.println("Horse");
                    break;
                case 11:
                    System.out.println("Sheep");
                    break;
                default:
                    System.out.println("Somethings wrong. Please try again");
            }

        } else
            System.out.println("Please enter a validate year. ");
    }
}
