import java.util.Scanner;

public class Pecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pecahan pertama (pembilang penyebut): ");
        int pembilang1 = input.nextInt();
        int penyebut1 = input.nextInt();

        System.out.println("Masukkan pecahan kedua (pembilang penyebut): ");
        int pembilang2 = input.nextInt();
        int penyebut2 = input.nextInt();

        System.out.println("Masukkan pecahan ketiga (pembilang penyebut): ");
        int pembilang3 = input.nextInt();
        int penyebut3 = input.nextInt();

        // Menyamakan penyebut semua pecahan
        int penyebutSama = penyebut1 * penyebut2 * penyebut3;

        // Menyamakan pembilang semua pecahan berdasarkan penyebut yang sama
        int pembilangSama1 = pembilang1 * (penyebutSama / penyebut1);
        int pembilangSama2 = pembilang2 * (penyebutSama / penyebut2);
        int pembilangSama3 = pembilang3 * (penyebutSama / penyebut3);

        // Melakukan penjumlahan pecahan
        int pembilangHasil = pembilangSama1 + pembilangSama2 + pembilangSama3;

        System.out.println("Hasil penjumlahan tiga pecahan: " + pembilangHasil + "/" + penyebutSama);

        input.close();
    }
}
