import java.util.Scanner;
public class Tugas2Pemilihan29 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("masukan jumlah sks:");
    int jumlahsks = sc.nextInt();
    
    if (jumlahsks>24){
        System.out.println("melebihi batas");
   } else{
        System.out.println("krs valid");
   }
}
}