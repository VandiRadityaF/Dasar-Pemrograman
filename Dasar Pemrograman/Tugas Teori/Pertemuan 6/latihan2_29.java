import java.util.Scanner;
public class latihan2_29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("masukan hari beli buku:");
        String hari = sc.nextLine();
        System.out.println("masukan buku yang dibeli:");
        String buku = sc.nextLine();
        System.out.println("masukan jumlah buku yang dibeli:");
        int jumlah = sc.nextInt();
        int diskon = 0;  

        if (hari.equals("rabu")){
            if(buku.equals("kamus")){
                diskon = 10;
                if (jumlah>2){
                    diskon +=2;
                }
            }else if (buku.equals("novel")){
                diskon = 7;
                if (jumlah>3){
                    diskon +=2;
                    }else if (jumlah<3){
                        diskon+=1;
                    }
                }else{
                    if(jumlah>3){
                        diskon=5;
                    }
                }
            }
            System.out.println("jumlah diskon yang anda dapat adalah:"+ diskon);
        }
    }