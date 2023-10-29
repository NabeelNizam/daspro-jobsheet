import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masullan bilangan bulat :");
        int bulat = input.nextInt();
        int i = 1, total=0, N=0;
        while(i <= bulat){
            N = i*i;
            total+=N;
            i++;
            System.out.print(N + "+");
             
        }
        System.out.print("=" + total);
        
        input.close();
    }
    
}
