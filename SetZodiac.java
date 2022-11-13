/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class SetZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String whichMMonth, january, february, march, april, may, june, july, august, september, october, november, december;
        int whichDay;

        System.out.println("Please state in lowercase which month did you born ? ");
        whichMMonth = input.nextLine();

        System.out.println("Please state which day did you born ? ");
        whichDay = input.nextInt();

        if(whichMMonth.equals("january")){
            if (1 <= whichDay && whichDay<= 21){
                System.out.println("You are a Capricorn !");
            } else
                System.out.println("You are a Aquarius !");
        } else if(whichMMonth.equals("february")){
            if (1 <= whichDay && whichDay<= 19){
                System.out.println("You are a Aquarius !");
            } else
                System.out.println("You are a Pisces !");
        } else if(whichMMonth.equals("march")){
            if (1 <= whichDay && whichDay<= 20){
                System.out.println("You are a Pisces !");
            } else
                System.out.println("You are a Aries !");
        } else if(whichMMonth.equals("april")){
            if (1 <= whichDay && whichDay<= 20){
                System.out.println("You are a Aries !");
            } else
                System.out.println("You are a Taurus !");
        } else if(whichMMonth.equals("may")){
            if (1 <= whichDay && whichDay<= 21){
                System.out.println("You are a Taurus !");
            } else
                System.out.println("You are a Gemini !");
        } else if(whichMMonth.equals("june")){
            if (1 <= whichDay && whichDay<= 22){
                System.out.println("You are a Gemini !");
            } else
                System.out.println("You are a Cancer !");
        } else if(whichMMonth.equals("july")){
            if (1 <= whichDay && whichDay<= 22){
                System.out.println("You are a Cancer !");
            } else
                System.out.println("You are a Leo !");
        } else if(whichMMonth.equals("august")){
            if (1 <= whichDay && whichDay<= 22){
                System.out.println("You are a Leo !");
            } else
                System.out.println("You are a Virgo !");
        } else if(whichMMonth.equals("september")){
            if (1 <= whichDay && whichDay<= 22){
                System.out.println("You are a Virgo !");
            } else
                System.out.println("You are a Libra !");
        } else if(whichMMonth.equals("october")){
            if (1 <= whichDay && whichDay<= 22){
                System.out.println("You are a Libra !");
            } else
                System.out.println("You are a Scorpio !");
        } else if(whichMMonth.equals("november")){
            if (1 <= whichDay && whichDay<= 21){
                System.out.println("You are a Scorpio !");
            } else
                System.out.println("You are a Sagittarius !");
        } else if(whichMMonth.equals("december")){
            if (1 <= whichDay && whichDay<= 21){
                System.out.println("You are a Sagittarius !");
            } else
                System.out.println("You are a Capricorn !");
        } else
            System.out.println("Wrong enter. Please try again.");
    }
}
