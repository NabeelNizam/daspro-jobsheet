import java.util.Scanner;

public class individu3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int angka;

    System.out.print("Masukkan angka: ");
    angka = sc.nextInt();

    for (int i = 1; i <= angka; i++) {
        for (int j = 1; j <= angka; j++) {
            if (i == 1 || i == angka || j == 1 || j == angka) {
                System.out.print( angka + " ");
            }else
            System.out.print("  ");
        }
        System.out.println();
    }
    sc.close();
    }
}
