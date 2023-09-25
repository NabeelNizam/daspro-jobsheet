import java.util.Scanner;

public class gaji22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk,jmlTdkMasuk,totGaji;
        int gaji, potGaji;

        System.out.println("Masukkan jumlah masuk kerja harian anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah tidak masuk kerja harian anda");
        jmlTdkMasuk=input.nextInt();
        System.out.println("Gaji yang ingin diberikan");
        gaji=input.nextInt();
        System.out.println("Potongan yang ingin diberikan");
        potGaji=input.nextInt();

        totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Total gaji anda adalah " + totGaji);
        input.close();
    }
}
