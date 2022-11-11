/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, passWord, coice, newPassWord;

        System.out.println("Please enter your Username: ");
        userName = input.nextLine();

        System.out.println("Please enter your Password: ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("patika123")){
            System.out.println("You login succesfully !");
        }else if (!userName.equals("patika") || !passWord.equals("patika123")){
            System.out.println("You either enter your Username or Password wrongly. Would like to change your password ? ");
            System.out.println("Please enter 'Y' for Yes, 'N' for No. ");
            coice = input.nextLine();
            if (coice.equals("Y")){
                System.out.println("Please enter your new password: ");
                newPassWord = input.nextLine();
                if (newPassWord.equals("patika123")){
                    System.out.println("Your new password can not be same with the old one. Please enter a new password: ");
                    newPassWord = input.nextLine();
                    if (!newPassWord.equals("patika123")){
                        System.out.println("Your password has been changed ! ");
                    }

                }else
                    System.out.println("Your password has been changed ! ");
            }
        }


    }
}
