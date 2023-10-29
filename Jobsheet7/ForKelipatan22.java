import java.util.Scanner;

public class ForKelipatan22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan,jumlah=0,counter=0;
        double rerata;
        System.out.print("Masukkan bilangan kelipatan (1-9)");
        kelipatan= scan.nextInt();
        for(int i = 1; i<=50;i++){
            if(i%kelipatan==0){
                jumlah+=i;
                counter++;
            }
        }
        rerata=(double)jumlah/counter;
        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.println(rerata);
        scan.close();
    }
    
}