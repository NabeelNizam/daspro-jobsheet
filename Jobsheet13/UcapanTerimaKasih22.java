import java.util.Scanner;

public class UcapanTerimaKasih22 {
    public static String penerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void ucapanTerimakasih() {
        String nama = penerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world \n" +
        "you inspired in me a love for learning and made me feel like i could ask anything. ");
    }
    public static void ucapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }
    public static void main(String[] args) {
            ucapanTerimakasih();
            ucapanTambahan("Your guidance and support have helped me grow as a person and as a learner. I am truly grateful for your presence in my life.");
    }
}