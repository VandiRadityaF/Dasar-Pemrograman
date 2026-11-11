import java.util.Scanner;
public class ArrayNilai29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilaiakhir[]=new int [10];

        for (int i=0;i<nilaiakhir.length;i++){
            System.out.print("masukan nilai akhir ke: "+(i+1)+" = ");
            nilaiakhir[i]=sc.nextInt();
        }
        for (int i=0;i<nilaiakhir.length;i++){
            String status = (nilaiakhir[i]>70?"LULUS":"TIDAK LULUS");
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiakhir[i] + " (" + status + ")"); 
        }
    }
}