import java.util.Scanner;

public class bayar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga,jumlah;
        double dis=0.1, total,bayar,jmlDis;

        System.out.println("Masukkan harga barang");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang anda");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Jumlah diskon anda" + jmlDis);
        System.out.println("Jumlah yang harus dibayarkan" + bayar);
        
        input.close();
    }
}