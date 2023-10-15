import java.util.Scanner;

public class ptm6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1 = ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 = ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan angka 3 = ");
        int angka3 = input.nextInt();
        int max;

        if (angka1 > angka2) {
            if (angka1 > angka3) {
                max = angka1;
            } else 
                max = angka3;
            
        } else {
            if (angka2 > angka3) {
                max = angka2;
            } else {
                max = angka3;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + max);
        input.close();
    }
}
