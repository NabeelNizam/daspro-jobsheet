import java.util.Scanner;

public class ArrayRataNilai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int counter = 0, jmlMhs, lulus = 0;
        double totalL = 0, totalTL=0;
        double rata2L, rata2TL;
        System.out.print("Masukka jumlah mahasiswa : ");
        jmlMhs=sc.nextInt();
        for(int i = 0; i<jmlMhs;i++){
            System.out.print("Masukka nilai mahasiswa ke-" + (i+1)+ ":");
            nilaiMhs[i] = sc.nextInt();
            if(nilaiMhs[i]>70){
              lulus++;
            }else
            counter++; 
        }
        for(int i = 0; i<nilaiMhs.length;i++){
            if(nilaiMhs[i]>70){
            totalL += nilaiMhs[i];
            }else
            totalTL+=nilaiMhs[i];
        }
        rata2TL=totalTL/counter;
        rata2L=totalL/lulus;
        System.out.println("Rata - rata nilai lulus = " + rata2L);
        System.out.println("Rata - rata nilai lulus = " + rata2TL);
        sc.close();
    }
}