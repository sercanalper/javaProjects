/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class WeatherSuggestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double degree;

        System.out.println("Please enter the degree: ");
        degree = input.nextDouble();

        if (degree < 5){

            System.out.println("You can go for Ski !!");

        }else if (degree >= 5 && degree <= 10){

            System.out.println("Go for Cinema and Watch some good film !!");

        }else if (degree > 10 && degree <= 15){

            System.out.println("If you are alone go for Cinema.");
            System.out.println("Else if you have a partner go for Picnic !");

        }else if (degree > 15 && degree <= 25){

            System.out.println("Definetly you should go for picnic !!");

        }else {

            System.out.println("Go for swimming !");

        }
    }
}
