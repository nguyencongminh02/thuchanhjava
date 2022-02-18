import java.util.Scanner;
public class App47 {
    public static void main(String[]args)throws Exception{
        int n, tong=0;
        Scanner so = new Scanner(System.in);
        do{
            System.out.print("Nhap so nguyen:");
            n = so.nextInt();
           tong += n;
        }while(tong<100);
        System.out.print(" Tong so vua nhap la: " +tong);
    }
}