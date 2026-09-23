import java.util.Scanner;
public class PemilihanIfElse29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---cetak krs siakad---");
        System.out.print("masukan semester saat ini:");
        int semester = sc.nextInt();

        if (semester==1){
            System.out.println("krs semester 1 ditampilkan");
        }else if (semester==2){
            System.out.println("krs semester 2 ditampilkan");
        }else if(semester==3){
            System.out.println("krs semester 3 ditampilkan");
        }else if (semester==4){
            System.out.println("krs semester 4 ditampilkan");
        }else if (semester==5){
            System.out.println("krs semester 5 ditampilkan");
        }else if (semester==6){
            System.out.println("krs semester 6 ditampilkan");
        }else if (semester==7){
            System.out.println("krs semester 7 ditampilkan");
        }else if (semester==8){
            System.out.println("krs semester 8 ditampilkan");
        }else {
            System.out.println("semester tidak valid");
        }

    }
}
