package Loops;

public class examples03 {
    public static void main(String[] args) {
        int left=120,right=300;// orta noktalarını tespit ediyor
        while(++left<--right);{
            System.out.println(left);
            System.out.println(right);
        }

    }
}
