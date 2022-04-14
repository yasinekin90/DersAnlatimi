package Loops;

public class examples00 {
    public static void main(String[] args) {

        int i=12; //not: increase the value of "i" to 12 to show the difference between the loops

        System.out.println("do-while loop is in progress...");
        do{

            System.out.print(i+",");
            i++;
        }while(i<=10);
        System.out.println();



         i=12;
        System.out.println("While loop is in progress...");
        while (i<=10){

            System.out.print(i+",");
            i++;
        }

    }
}
