import java.util.Scanner;

public class BioskopwithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int baris,kolom,pilihan,counter=0;
        String nama,next;
        String[][] penonton = new String [4][2];
        
        while (true) {
            System.out.println("1.Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih (1/2/3): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                while (true) {
                System.out.print("Masukkan nama :");
                nama = sc.next();
                System.out.print("Masukkan baris :");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom :");
                kolom = sc.nextInt();
                sc.nextLine();
                
                if(baris < 1||baris > 4||kolom<1||kolom > 2){
                    System.out.println("Maff kursi tidak tersedia");
                }else if(penonton[baris-1][kolom-1]!= null){
                    System.out.println("Kursi ini sudah terisi silahkan input lagi");
                }else {
                penonton[baris-1][kolom-1] = nama;
                System.out.print("Input penonton lainnya (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n"))
                break;
                }
                }
                break;
                case 2:
                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 2; j++){
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ":" + penonton[i][j]);
                        }else {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": *****");
                        }
                    }
                }
                break;
                case 3:
                System.out.println("Terima Kasih");
                break;

                default:
                System.out.println("Silahkan memilihi pilihan yang sudah disediakan");
                    break;
            }  
        }
    }
}
