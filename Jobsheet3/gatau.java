import java.util.Scanner;

public class gatau {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);

        System.out.print("Masukkan waktu");
        int waktu =input.nextInt();
        int sepuh;
        sepuh = waktu % 60;
        System.out.println(sepuh);
        input.close();
    }
}
