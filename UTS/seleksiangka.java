import java.util.Scanner;

public class seleksiangka {
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.println("Masukkan angka: ");
       int N = input.nextInt();
       int jumlah = 0;
       while (N > 0) {
           int akhirDigit = N % 10;
           if (akhirDigit % 2 != 0) {
               jumlah++;
           }
           N /= 10;
       }

       System.out.println("Jumlah digit yang ganjil = " + jumlah);
       input.close();
    }
}
