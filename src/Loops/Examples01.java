package Loops;

import jdk.swing.interop.SwingInterOpUtils;

public class Examples01 {
    public static void main(String[] args) {

        int i=1;
        int k=1;
        System.out.println("Program başladı");
        // ifadeyi bir de döngünün içine yazarak deneyelim
        while (i<=5){

            System.out.println("k="+k);
            System.out.println(i);
            while(k<=10)
            {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
            System.out.println("k="+k);

            System.out.println();

            i++;
        }
    }
}
