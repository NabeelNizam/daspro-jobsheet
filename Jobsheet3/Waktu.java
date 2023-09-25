import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Scanner scanner = new Scanner(System.in);

        // Masukkan waktu masuk dan waktu keluar dalam format HH:mm
        System.out.print("Masukkan waktu masuk (HH:mm): ");
        String waktuMasukStr = scanner.nextLine();
        System.out.print("Masukkan waktu keluar (HH:mm): ");
        String waktuKeluarStr = scanner.nextLine();

        // Parse string waktu masuk dan waktu keluar menjadi objek Date
        Date waktuMasuk = dateFormat.parse(waktuMasukStr);
        Date waktuKeluar = dateFormat.parse(waktuKeluarStr);

        // Hitung durasi penggunaan ruang kelas
        long durasiMillis = waktuKeluar.getTime() - waktuMasuk.getTime();
        long durasiMenit = durasiMillis / (60 * 1000);

        // Cetak durasi penggunaan ruang kelas
        System.out.println("Durasi penggunaan ruang kelas: " + durasiMenit + " menit");
        scanner.close();
    }
}
