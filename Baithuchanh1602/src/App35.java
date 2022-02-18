import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        int firstNumber, secondNumber;
        System.out.println("Nhap so thu nhat: ");
        try (Scanner sc = new Scanner(System.in)) {
            firstNumber = sc.nextInt();
            System.out.println("Nhap so thu hai: ");
            secondNumber = sc.nextInt();
        }
        int minNumber = firstNumber;
        if(firstNumber > secondNumber)
          minNumber = secondNumber;   
        System.out.println("So nho nhat trong 2 so: " + firstNumber + " va " +secondNumber + " la : " +minNumber);

    }
}