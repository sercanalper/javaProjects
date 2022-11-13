/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class SetZodiac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int whichMMonth;
        int whichDay;

        System.out.println("Please state which month did you born ?\nJanuary for 1\nFebruary for 2\nMarch for 3\nApril for 4\nMay for 5\nJune for 6\nJuly for 7\nAugustus for 8\nSeptember for 9\nOctober for 10\nNovember for 11\nDecember for 12 ");
        whichMMonth = input.nextInt();

        System.out.println("Please state which day did you born ? ");
        whichDay = input.nextInt();

        switch (whichMMonth) {

            case 1:
                if (1 <= whichDay && whichDay<= 21){
                    System.out.println("You are a Capricorn !");
                } else
                    System.out.println("You are a Aquarius !");
                break;

            case 2:
                if (1 <= whichDay && whichDay<= 19){
                    System.out.println("You are a Aquarius !");
                } else
                    System.out.println("You are a Pisces !");
                break;

            case 3:
                if (1 <= whichDay && whichDay<= 20){
                    System.out.println("You are a Pisces !");
                } else
                    System.out.println("You are a Aries !");
                break;

            case 4:
                if (1 <= whichDay && whichDay<= 20){
                    System.out.println("You are a Aries !");
                } else
                    System.out.println("You are a Taurus !");
                break;

            case 5:
                if (1 <= whichDay && whichDay<= 21){
                    System.out.println("You are a Taurus !");
                } else
                    System.out.println("You are a Gemini !");
                break;

            case 6:
                if (1 <= whichDay && whichDay<= 22){
                    System.out.println("You are a Gemini !");
                } else
                    System.out.println("You are a Cancer !");
                break;

            case 7:
                if (1 <= whichDay && whichDay<= 22){
                    System.out.println("You are a Cancer !");
                } else
                    System.out.println("You are a Leo !");
                break;

            case 8:
                if (1 <= whichDay && whichDay<= 22){
                    System.out.println("You are a Leo !");
                } else
                    System.out.println("You are a Virgo !");
                break;

            case 9:
                if (1 <= whichDay && whichDay<= 22){
                    System.out.println("You are a Virgo !");
                } else
                    System.out.println("You are a Libra !");
                break;

            case 10:
                if (1 <= whichDay && whichDay<= 22){
                    System.out.println("You are a Libra !");
                } else
                    System.out.println("You are a Scorpio !");
                break;

            case 11:
                if (1 <= whichDay && whichDay<= 21){
                    System.out.println("You are a Scorpio !");
                } else
                    System.out.println("You are a Sagittarius !");
                break;

            case 12:
                if (1 <= whichDay && whichDay<= 21){
                    System.out.println("You are a Sagittarius !");
                } else
                    System.out.println("You are a Capricorn !");
                break;

            default:
                System.out.println("Something's wrong. Please try again.");

        }

    }
}
