import java.util.Scanner;

public class DoWHileCuti22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jatahCuti,jmlhHari;
        String konfirmasi;
        System.out.println("Jatah cuti : ");
        jatahCuti = sc.nextInt();
        
        do{
            System.out.print("Apakah ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah hari: ");
                jmlhHari = sc.nextInt();

                if (jmlhHari<=jatahCuti){
                jatahCuti-=jmlhHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else 
                    System.out.println("Jatah cuti anda tidak mencukupi");
                
            }
            if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }

        } while(jatahCuti>0);
        sc.close();
    }
}
