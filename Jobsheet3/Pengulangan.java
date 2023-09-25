import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pengulangan yang diinginkan: ");
        int jumlahPengulangan = input.nextInt();

        for (int i = 0; i < jumlahPengulangan; i++) {
            // Di sini Anda dapat menambahkan rumus yang ingin diulang
            double hasil = hitungRumus(i); // Gantilah hitungRumus(i) dengan rumus yang sesuai
            System.out.println("Hasil pengulangan ke-" + (i + 1) + ": " + hasil);
        }

        input.close();
    }

    // Fungsi ini mewakili rumus yang ingin diulang
    public static double hitungRumus(int iterasi) {
        // Gantilah ini dengan rumus yang sesuai berdasarkan iterasi
        return iterasi * 2.0; // Contoh rumus: mengalikan iterasi dengan 2
    }
}
