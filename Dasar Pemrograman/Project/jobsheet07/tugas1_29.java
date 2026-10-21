import java.util.Scanner;
public class tugas1_29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total, jumlah, harga=50000, total_pelangan;
        System.out.println("masukan jumlah pelangan:");
        total_pelangan = sc.nextInt();
        for(int i=1;i<=total_pelangan;i++){
            System.out.println("masukan jumlah ticket pelangan ke-"+i);
            jumlah = sc.nextInt();
            if(jumlah <0){
                System.out.println("input ulang");
                i--;
                continue;
            }
            if(jumlah > 4 && jumlah <= 10){
                total = jumlah * harga - jumlah * harga * 10/100;
            }else if(jumlah > 10){
                total = jumlah * harga - jumlah * harga * 15/100;
            }else{
                total = jumlah * harga;
            }
            System.out.println("total harga pelangan ke-"+i+"="+total);
        }
    }}