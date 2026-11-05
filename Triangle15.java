import java.util.Scanner;
public class Triangle15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = n; 
        while (i >= 1) {
            System.out.print("[i=" + i + "] ");
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i--;
        }
        sc.close();
    }
}