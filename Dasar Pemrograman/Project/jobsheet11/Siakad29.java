import java.util.Scanner;
public class Siakad29{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] nilai = new int[4][3];
      
      for (int i=0;i<nilai.length;i++){
        System.out.println("input nilai mahasiswa ke:"+(i+1));
        double total=0;
        for (int j=0;j<nilai[i].length;j++){
            System.out.println("nilai mata kuliah "+(j+1)+":");
            nilai[i][j] = sc.nextInt();
            total=+nilai[i][j];
        }
         System.out.println("Nilai rata-rata: " + total / nilai[i].length); 
      }
      System.out.println("\n========================================");
      System.out.println("Rata-rata nilai setiap mata kuliah:");
      for (int j = 0; j < nilai[0].length; j++) { 
    }}}