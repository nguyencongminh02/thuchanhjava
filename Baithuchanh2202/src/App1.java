import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int a , b;
        Scanner mc = new Scanner(System.in);
    do{
       System.out.println("Nhap so nguyen duong a:");
       a = mc.nextInt();
    }while (a <=0);
    do{
       System.out.println("Nhapp so nguyen duong b:");
       b = mc.nextInt();
    }while (b <=0);
     System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
    }
public static int UCLN( int a, int b){
        if( b == 0) return a;
        return UCLN(b, a % b);
}

}