/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username:");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank ! What would you like to ? ");
                do {
                    System.out.println("1- Deposite Money\n" +
                            "2- Withdraw Money\n" +
                            "3- Balance Inquiry\n" +
                            "4- Log Out.");
                    select = input.nextInt();


                    switch (select) {
                        case 1:
                            System.out.print("Money amount: ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Money amount: ");
                            int priceOut = input.nextInt();
                            if (priceOut > balance) {
                                System.out.println("Insufficient balance.");

                            } else
                                balance -= priceOut;
                            break;

                        case 3:
                            System.out.println("Your Balance is: " + balance);
                            break;

                        case 4:
                            break;
                    }
                } while (select != 4);
                System.out.println("Have a nice day :)");
                break;

            } else {
                System.out.println("Wrong username or password. Please try again.");
                right--;
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Remaining balance is: " + right);
                }
            }
        }
    }
}