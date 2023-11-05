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
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan nama :");
                nama = sc.nextLine();
                System.out.print("Masukkan baris :");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom :");
                kolom = sc.nextInt();
                sc.nextLine();

                penonton[baris-1][kolom-1] = nama;
                System.out.print("Input penonton lainnya (y/n): ");
                next = sc.nextLine();
                if (next.equals("y")) {
                    counter++;
                }
                if (next.equalsIgnoreCase("n"))
                break;
                case 2:
                if (counter>0){
                    System.out.println("Daftar penonton bioskop");
                    for(int i=0; i < counter; i++){
                        System.out.println("Nama " + nama[]);
                    }
                }

                default:
                    break;
            }
            
            
        }
        sc.close();
    }
}
