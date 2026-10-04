import java.util.Scanner;
public class nestedUjianSkripsi29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("apakah mahasiswa bebas kompen(ya/tidak)?");
        String kompen = sc.nextLine();

        System.out.println("jumlah bimbingan pembimbing 1:");
        int bimbingan1 = sc.nextInt();

        System.out.println("jumlah bimbingan pembimbing2:");
        int bimbingan2 = sc.nextInt();
        String pesan; 

        if(kompen.equals("ya")){
            if(bimbingan1>8 && bimbingan2>4){
                pesan = "syarat terpenuhi mahasiswa. mahasiswa boleh daftar ujian skripsi";
            }else if(bimbingan1<8 && bimbingan2<4){
                pesan = "gagal! log bimbingan pembimbing 1 dan pembimbing 2 kurang dari 8 dan 4";
            }else if(bimbingan1<8){
                pesan = "gagal! log bimbingan pembimbing1 kurang dari 8";
            }else{
                pesan = "gagal! log bimbingan pembimbing2 kurang dari 4";
            }
        }else{
            pesan = "gagal! karena mahasiswa masih ada tangungan kompen";
        }
        System.out.println(pesan);
    }
}