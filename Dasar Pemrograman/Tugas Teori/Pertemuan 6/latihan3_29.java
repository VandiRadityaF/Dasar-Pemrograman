import java.util.Scanner;
public class latihan3_29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Daftar Merk Sepatu:\n1. converse\n2. sketcher\n3. nike ");
        System.out.println("masukan merk sepatu yang dibeli:");
        String merk = sc.nextLine();
        int ukuran;

        if (merk.equals("converse")){
            System.out.println("Daftar Kategori:\n1. slip On\n2. high top ");
            System.out.println("masukan kategori sepatu:");
            String kategori = sc.nextLine();
            if (kategori.equals("slip on")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=36 && ukuran<=40){
                    System.out.println("harga sepatu adalah 800.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else if (kategori.equals("high top")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=40 && ukuran<=44){
                    System.out.println("harga sepatu adalah 1.200.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else{
                System.out.println("kategori tidak tersedia");
            }
        }else if (merk.equals("sketcher")){
            System.out.println("Daftar Kategori:\n1. woman\n2. man ");
            System.out.println("masukan kategori sepatu:");
            String kategori = sc.nextLine();
            if (kategori.equals("woman")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=36 && ukuran<=41){
                    System.out.println("harga sepatu adalah 1.000.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else if (kategori.equals("man")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=41 && ukuran<=44){
                    System.out.println("harga sepatu adalah 1.800.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else{
                System.out.println("kategori tidak tersedia");
            }
        }else if (merk.equals("nike")){
            System.out.println("Daftar Kategori:\n1. kids\n2. adult ");
            System.out.println("masukan kategori sepatu:");
            String kategori = sc.nextLine();
            if (kategori.equals("kids")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=36 && ukuran<=40){
                    System.out.println("harga sepatu adalah 750.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else if (kategori.equals("adult")){
                System.out.println("masukan ukuran sepatu:");
                ukuran = sc.nextInt();
                if (ukuran>=40 && ukuran<=44){
                    System.out.println("harga sepatu adalah 1.500.000");
                }else{
                    System.out.println("ukuran tidak tersedia");
                }
            }else{
                System.out.println("kategori tidak tersedia");
            }
        }else{
            System.out.println("merk tidak tersedia");
        }
    }
}