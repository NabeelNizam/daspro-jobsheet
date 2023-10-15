import java.util.Scanner;

public class pemilihan2perocbaan122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        int tahun = input22.nextInt();
        if((tahun %4)==0){
            if ((tahun%100)!=0) 
                    System.out.print("Tahun Kabisat");
            else
                if ((tahun%400)!=0)
                System.out.println("Tahun Kabbisat");
            else
                System.out.print("Bukan tahun kabisat");
        }
        input22.close();
    }
}
