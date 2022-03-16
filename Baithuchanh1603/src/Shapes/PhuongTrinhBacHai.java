package Shapes;
import java.util.Scanner;
public class PhuongTrinhBacHai {
  Double hesoA, hesoB, hesoC ;
  public void NhapCacHeSo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap he so A: ");
    hesoA = sc.nextDouble();
    System.out.println("Nhap he so B: ");
    hesoB = sc.nextDouble();
    System.out.println("Nhap he so C: ");
    hesoC = sc.nextDouble();
  }
  public void GiaiPhuongTrinh(){
    Double x1,x2;
    Double delta = hesoB*hesoB - 4*hesoA*hesoC;
    if (delta < 0) {
      System.out.println("Phương trinh vo nghiem!");
    } else if (delta == 0) {
      x1 = -hesoB / (2 * hesoA);
      System.out.println("Phuong trinh co 1 nghiem la x1 = x2 = " + x1);
    } else {
      x1 = (-hesoB + Math.sqrt(delta)) / (2 * hesoA);
      x2 = (-hesoB - Math.sqrt(delta)) / (2 * hesoA);
      System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " va x2 = " + x2);
    }
  }
}