import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int jmlElemen = sc.nextInt();
        int[] elemen= new int[jmlElemen];

        for(int i = 0; i < jmlElemen;i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ":");
            elemen[i]= sc.nextInt();
        }
        int nilaiTertinggi = elemen[0];
        int nilaiTerendah = elemen[0];
        int rerata = elemen[0];
        double rata2;

        for(int i = 1;i < jmlElemen;i++){
            if(elemen[i] > nilaiTertinggi){
                nilaiTertinggi=elemen[i];
            }
            if(elemen[i] < nilaiTertinggi){
                nilaiTerendah=elemen[i];
            }
            rerata += elemen[i];
        }
        rata2 = (double) rerata/jmlElemen;

        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Rata rata : " + rata2);
        sc.close();
    }
}
