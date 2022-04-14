package Loops;

public class Examples02 {
    public static void main(String[] args) {

        int i=1;


        while(i<10){
            System.out.println("i="+i);
            int k=1;
            while(k<5){
                int l=1;
                System.out.println("k= "+k+",");

                while(l<5){
                    System.out.print(l+",");
                    l++;
                }
                System.out.println();
                k++;

            }
            System.out.println();
            i++;
        }

    }
}
