import java.util.Scanner;

public class hargabayar22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkBuku;
        int harga,jumlah;
        int jmlHalamanBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku yang dibeli");
        merkBuku=input.nextLine();
        System.out.println("Jumlah halaman buku yang dibeli");
        jmlHalamanBuku=input.nextInt();
        System.out.println("besar diskon");
        dis=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Buku yang dibeli adalah" + merkBuku);
        System.out.println("dengan jumlah halaman" + jmlHalamanBuku);
        System.out.println("Jumlah diskon yang didapatkan adalah" + jmlDis);
        System.out.println("total yang harus dibayarkan"+ bayar);
        input.close();
    }
}
