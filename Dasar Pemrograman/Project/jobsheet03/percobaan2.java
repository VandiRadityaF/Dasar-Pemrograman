import java.util.Scanner;
public class percobaan2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan panjang lapangan");
        int panjang = sc.nextInt();

        System.out.print("masukan lebar lapangan");
        int lebar = sc.nextInt();

        int luas = panjang * lebar;

        System.out.println("luas lapangan ="+ luas);



    }

    }