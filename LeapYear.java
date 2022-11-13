/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.println("Please enter a year to learn weather it is a Leap Year or not: ");
        year = input.nextInt();

        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        } else
            is_leap_year = false;

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
}

