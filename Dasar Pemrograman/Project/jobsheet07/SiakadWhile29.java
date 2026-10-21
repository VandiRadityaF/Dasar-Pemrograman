import java.util.Scanner;
public class SiakadWhile29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilai, jumlah , i=0;

        System.out.println("masukan jumlah mahasiswa");
        jumlah = sc.nextInt();
        while(i < jumlah){
            System.out.println("masukan nilai mahasiswa ke-"+(i+1));
            nilai = sc.nextInt();
            if(nilai > 100 || nilai <0){
                System.out.println("nilai tidak valid");
            }if(nilai > 80 && nilai <= 100){
                System.out.println("nilai mahasiswa ke-"+(i+1)+" A");
            }else if(nilai > 73 && nilai <= 80){
                System.out.println("nilai mahasiswa ke-"+(i+1)+" B+");
            }else if(nilai > 65 && nilai <= 73){
                System.out.println("nilai mahasiswa ke-"+(i+1)+" B");
            }else if(nilai > 60 && nilai <= 65){
                System.out.println("nilai mahasiswa ke-"+(i+1)+"C+");
            }else if(nilai > 50 && nilai <= 60){
                System.out.println("nilai mahasiswa ke-"+(i+1)+" C");
            }else if(nilai > 39 && nilai <= 50){
                System.out.println("nilai mahasiswa ke-"+(i+1)+" D");
            }else{
                System.out.println("nilai mahasiswa ke-"+(i+1)+" E");
            }
            i++;
        }
    }
}