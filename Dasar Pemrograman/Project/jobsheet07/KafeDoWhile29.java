import java.util.Scanner;
public class KafeDoWhile29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, total;
        String nama;
        int harga_kopi = 12000, harga_teh = 7000, harga_roti = 20000;
        
        do { 
            System.out.println("masukan nama pelanggan:(ketik batal untuk  keluar)");
            nama = sc.nextLine();
            if(nama.equalsIgnoreCase("batal")){
                System.out.println("transaksi dibatalkan");
                break;
            }System.out.println("jumlah kopi:");
            kopi = sc.nextInt();
            System.out.println("jumlah teh:");
            teh = sc.nextInt();
            System.out.println("jumlah roti:");
            roti = sc.nextInt();
            total = (kopi * harga_kopi)+(teh * harga_teh)+(roti * harga_roti);
            System.out.println("total harga:"+total);
            sc.nextLine();
        } while (true);
        System.out.println("transaksi selesai");
    }
}