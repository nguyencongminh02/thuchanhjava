import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double hesoA, hesoB, hesoC, nghiemX1, nghiemX2, delta;
        System.out.println("nhap he so A");
        Scanner cm = new Scanner(System.in);
        hesoA = cm.nextDouble();
        System.out.println("nhap he so B");
        hesoB = cm.nextDouble();
        System.out.println("nhap he so C");
        hesoC = cm.nextDouble();
        delta = Math.pow(hesoB, 2) - 4 * hesoA * hesoC;
        if (delta <0){
            System.out.println("phuong trinh vo nghiem");
        } else if (delta == 0){
           nghiemX1 = -hesoB / (2 * hesoA);  
        System.out.println("phuong trinh co 1 nghiem la X1 = X2 = " + nghiemX1);
        } else {
            nghiemX1 = (- hesoB + Math.sqrt(delta))/ (2* hesoA);
            nghiemX2 = (- hesoB - Math.sqrt(delta))/ (2* hesoA);
        System.out.println("phuong trinh co 2 nghiem la X1 =  " + nghiemX1 + " va X2 = " + nghiemX2);
        }
        }

   }
