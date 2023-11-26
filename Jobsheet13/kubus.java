import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s,V,L;
      
      System.out.print("Masukkan besar sisi: ");
      s = sc.nextInt();

      V = menghitungVolume(s) ;
      System.out.println("Volume kubus tersebut adalah " + V);

      L = menghitungLuaspermukaan(s);
      System.out.println("Luas permukaan kubus tersebut adalah " + L);
      sc.close();
    }
   static int menghitungVolume(int sisi) {
     int volume = sisi*sisi*sisi;
     return volume;
   } 

   static int menghitungLuaspermukaan(int sisi){
    int luas = 6*sisi*sisi;
    return luas;
   }
}
