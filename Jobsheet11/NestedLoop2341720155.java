import java.util.Scanner;

public class NestedLoop2341720155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double[5][7];
        double sum = 0, avg =0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke- " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke " + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
                sum += temps[i][j];
            }
            avg = sum / temps[i].length ;
            System.out.println("Rata-rata kota: " + avg);   
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i+1) + ": ");
            System.out.println(sum);
            for (double temp : temps[i]) {
                System.out.print(temp + "");     
            }
            System.out.println();
        }
        sc.close();
    }
}
