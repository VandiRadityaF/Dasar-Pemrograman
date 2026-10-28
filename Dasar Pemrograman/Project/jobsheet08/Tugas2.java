import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.println("masukan n:");
      int n = sc.nextInt();
      int jumlahs=0;

      for(int i=1;i<= n;i++){
        for(int j=1;j<=n;j++){
            int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahs += hasil;
        }
        System.out.println();
      }
        System.out.println("Jumlah seluruh angka: " + jumlahs);
        
        sc.close();
    }}