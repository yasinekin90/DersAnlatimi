package Loops;

import java.util.Scanner;

public class examples04 {
    public static void main(String[] args) {
        int password;
        boolean isPasswordValid=false; // not=Try the same loop by assigning true
        Scanner input=new Scanner(System.in);

        while(!isPasswordValid){
            System.out.print("Enter password:");
            password=input.nextInt();
            if(password==1998){

                System.out.println("Password is valid!");
              isPasswordValid=true;

            }else{
                System.out.println("Invalid password! Try again");
            }

        }
    }



}
