import java.util.Scanner;

public class NilaiMahasiswa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlahMahasiswa = sc.nextInt();

    
    System.out.print("Masukkan jumlah tugas: ");
    int jumlahTugas = sc.nextInt();

    //Inisialisasi array nilai
    int[][] dataNilai = new int[jumlahMahasiswa][jumlahTugas];

    inputNilai(dataNilai);
    tampilNilai(dataNilai);
    int NilMax = getNilaiMax(dataNilai);
    int hari = getHariNilaiMax(dataNilai);
    int hasil  = getMhsNilaiMax(dataNilai);
    System.out.println("Nilai Paling Besar "+ NilMax +" ada di hari ke "+ hari +
    " didapatkan oleh mahasiswa ke "+hasil);

    sc.close();
  }

  //INPUT NILAI MAHASISWA
    public static void inputNilai(int[][] nilaiMhs) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < nilaiMhs.length; i++){
          for(int j = 0; j < nilaiMhs[i].length; j++){
            System.out.print("Nilai mahasiswa [" + i + "][" + j + "]: ");
            nilaiMhs[i][j] = sc.nextInt();
          }  
        }
       sc.close(); 
    }

    //MENAMPILKAN NILAI
    static void tampilNilai(int[][] nilaiMhs){
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < nilaiMhs.length; i++) {
        for (int j = 0; j < nilaiMhs[i].length; j++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " hari ke-" + (j + 1) + ": " + nilaiMhs[i][j]);
        }
    }
    sc.close();
    }
    //MENDAPATKAN NILAI MAX
    static int getNilaiMax(int [][] nilaiMhs){
      int nilaiMhsMax = nilaiMhs[0][0];
      for(int i = 0; i < nilaiMhs.length; i++){
        for(int j=0;j<nilaiMhs[i].length;j++){
          if(nilaiMhs[i][j]>nilaiMhsMax){
            nilaiMhsMax=nilaiMhs[i][j];
        
          }
        }
      }
      return nilaiMhsMax;
    }
    //MENDAPATKAN Hari ke- NILAI MAX
    static int getHariNilaiMax(int [][] nilaiMhs){
      int harike = 0;
      int nilaiMhsMax = nilaiMhs[0][0];
      for(int i = 0; i < nilaiMhs.length; i++){
        for(int j=0;j<nilaiMhs[i].length;j++){
          if(nilaiMhs[i][j]>nilaiMhsMax){
            nilaiMhsMax=nilaiMhs[i][j];
            harike=j;
          }
        }
      }
      return harike+1;
    }
    
  //MENDAPATKAN MAHASISWA NILAI MAX
  static int getMhsNilaiMax(int[][] nilaiMhs){
    int mhsKe = 0;
    int nilaiMax = nilaiMhs[0][0];
    for (int i = 0; i < nilaiMhs.length; i++) { 
      for (int j = 0; j < nilaiMhs[i].length; j++) {
        if (nilaiMhs[i][j] > nilaiMax) {
          nilaiMax = nilaiMhs[i][j];
          mhsKe = i;
        }
      }
    }
    return mhsKe+1;
}

}
