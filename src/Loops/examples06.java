package Loops;

import java.util.Scanner;

public class examples06 {
    public static void main(String[] args) {
        // Differences between for , while and do-while loops
        Scanner input=new Scanner(System.in);
/*
        int number;
        for (boolean run=true ; run ; ){    // for(;;)  while(true)
            System.out.print("Enter a number: ");
            number=input.nextInt();

            if(number<0){
                System.out.println("progress ended");
                run= false;
            }
        }*/

     /*   System.out.print("Enter a number: ");
        int number=input.nextInt();
        while(number>=0){
            System.out.print("Enter a number: ");
            number=input.nextInt();
        }*/


/*
        int number;

        do {
            System.out.print("Enter a number: ");
              number=input.nextInt();
          }while(number>0);*/


       for (int number =1; 0<=number ; ) {
            System.out.print("enter number:");
            number=input.nextInt();
        }


       /* for (int i = 1; i <=10 ; i++) { //hangisi daha basit karşılastır
            System.out.println(i);
        }*/

      /*  int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }*/

    }
}
