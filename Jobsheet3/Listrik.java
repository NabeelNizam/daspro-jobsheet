import java.util.Scanner;

public class Listrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R1,R2,R3,R4,I,akhir;
        float v;

    //Memasukkan Nilai dari Resistor
        System.out.println("Masukkan R1: ");
        R1 = input.nextInt();
        System.out.println("Masukkan R2: ");
        R2 = input.nextInt();
        System.out.println("Masukkan R3: ");
        R3 = input.nextInt();
        
    //Pengoperasian Rangkaian yang Tersusun Secara Paralel
        double penyebut = R1 * R2 * R3;
        double pembilang1 = 1 * (penyebut / R1);
        double pembilang2 = 1 * (penyebut / R2);
        double pembilang3 = 1 * (penyebut / R3);
        double hasil = pembilang1 + pembilang2 + pembilang3;
        akhir = penyebut / hasil;
        System.out.println("Hasil dari rangkaian paralel adalah: " + akhir);
        
    //Pemasukan Nilai dan Pengoperasian Rangkaian yang Tersusun Seri
        System.out.println("Masukkan R4: ");
        R4 = input.nextInt();

        double Rtotal = akhir + R4;
        System.out.println("Hasil dari rangkaian total adalah: " + Rtotal);

    //Pemasukan Nilai Kuat Arus dan Pengoperasian Tegangan
        System.out.println("Masukkan I: ");
        I = input.nextInt();

        v = (float) (I * Rtotal);
        System.out.println("Hasil dari tegangan adalah: " + v);
        input.close();
    }
}
