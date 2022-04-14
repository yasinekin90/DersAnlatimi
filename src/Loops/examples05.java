package Loops;

import java.util.Scanner;

public class examples05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int password;
        boolean askPassword=false; // change the value to false and navigate the difference between while and do-while
                                  // compare with examples04

        do {
            System.out.print("Password: ");
            password = input.nextInt();
            if (password == 12345) {
                System.out.println("valid password!");
                askPassword = true;
            } else {
                System.out.println("invalid password! try again.");
            }
               }while (!askPassword);



    }
}
