import java.util.Scanner;

public class Individu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
            System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
