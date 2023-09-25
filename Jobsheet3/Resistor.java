import java.util.Scanner;

public class Resistor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah resistor dalam rangkaian paralel: ");
        int jumlahResistor = input.nextInt();

        double totalInverseResistance = 0.0;

        for (int i = 1; i <= jumlahResistor; i++) {
            System.out.print("Masukkan nilai hambatan resistor ke-" + i + " (ohm): ");
            double hambatan = input.nextDouble();
            // Menghitung invers hambatan dan menambahkannya ke totalInverseResistance
            totalInverseResistance += 1.0 / hambatan;
        }

        // Menghitung nilai hambatan total (R_total) dari invers totalInverseResistance
        double hambatanTotal = 1.0 / totalInverseResistance;

        System.out.println("Hambatan total (R_total) dari rangkaian paralel adalah " + hambatanTotal + " ohm");

        input.close();
    }
}
