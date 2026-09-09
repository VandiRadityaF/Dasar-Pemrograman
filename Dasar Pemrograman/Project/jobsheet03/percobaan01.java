public class percobaan01{
    public static void main(String[] args){

        int x =10;
        System.out.println("++x=");
        System.out.println("Setelah evaluasi, x = " + x);
        x=10;
        System.out.println("++x = "+ ++x);
        System.out.println("Setekah evaluasi, x = "+x);
        int y=12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah "+ z);
        z %= 2 ;
        System.out.println("Hasil akhir = " +z);

    }
}