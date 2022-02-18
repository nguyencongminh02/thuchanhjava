import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, soDu, sum = 0;
        System.out.println("Nhap so nguyen duong: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
        }
        System.out.println("Tong cac chu so = " + sum);

    }
}