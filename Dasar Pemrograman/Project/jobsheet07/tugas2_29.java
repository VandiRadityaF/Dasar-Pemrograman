import java.util.Scanner;
public class tugas2_29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0,tarif1=3000,tarif2=2000;
        do{
            System.out.println("masukan jenis kendaraan");
            System.out.println("1. mobil");
            System.out.println("2. motor");
            System.out.println("0SS. keluar");
            jenis = sc.nextInt();
            if(jenis == 1){
                System.out.println("masukan durasi parkir mobil");
                durasi = sc.nextInt();
                total = tarif1 * durasi;
                System.out.println("total parkir mobil ="+total);
            }else if(jenis == 2){
                System.out.println("masukan durasi parkir motor");
                durasi = sc.nextInt();
                total = tarif2 * durasi;
                System.out.println("total parkir motor ="+total);
            }else if(jenis == 0){
                System.out.println("terimakasih");
            }else{
                System.out.println("input salah");
            }
        }while(jenis != 0);
    }
}