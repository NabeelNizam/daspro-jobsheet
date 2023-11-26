import java.util.Scanner;

public class Ucapan22 {
 
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin diberikan ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan(); 
        System.out.println("Thank you " + nama + "\n May the force be with you");
    }
}
