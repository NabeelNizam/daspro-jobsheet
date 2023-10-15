import java.util.Scanner;

public class WHILEgaji22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur =0,totalGajiLembur=0;
        String jabatan;
        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur,Manajer,karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan=scan.next();
            System.out.print("Masukkan jam jumlah lembur: ");
            jumlahJamLembur=scan.nextInt();
            i++;  
             
            
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur=jumlahJamLembur * 100000;    
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur=jumlahJamLembur * 75000;
               totalGajiLembur += gajiLembur; 
            }else{
                System.out.println("Jabatan Invalid");
                i--;
            }
              
                

                         
        }
         System.out.println("Total gaji lembur: " + totalGajiLembur);
        scan.close();
    }
}
