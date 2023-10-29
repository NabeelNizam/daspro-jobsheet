import java.util.Scanner;

public class segitiga{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1 : ");
        int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan 2 : ");
        int bil2 = input.nextInt();
        System.out.println("Masukkan bilangan 3 : ");
        int bil3 = input.nextInt();

        int total=bil1+bil2+bil3;
        if(total == 180 && bil1>0 && bil2>0&& bil3>0 && bil1<180 && bil2<180 && bil3<180){
            System.out.println("Input berhasil");
        }else{
            System.out.println("Input tidak sesuai");
        }

        if (bil1==(bil2 +bil3) || bil2==(bil3+1) || bil3==(bil2+bil1)) {
            System.out.println("Segitiga siku- siku");
            System.out.println("Total sudut adalah " + total);
        }else{
            System.out.print("Bukan Segitiga Siku - siku");
        }
        input.close();
    }
}