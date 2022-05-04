import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;
import java.util.Scanner;
public class App2604 {
    public static void main(String[] args) throws Exception {
       Point p = new Point();
        Quadrilateral q = new Quadrilateral();
        Triangle t = new Triangle();
         System.out.print("\n1. Nhap toa do cho mat phang OXY: ");
         System.out.print("\n2. Nhap va kiem tra tam giac: ");
         System.out.print("\n3. Nhap va kiem tra tu giac: ");
         System.out.print("\n4. Thoat ");
         try (Scanner sc = new Scanner(System.in)) {
        System.out.println("\nNhap su lua chon cua ban: ");
            int luachon = sc.nextInt();
            if( luachon == 1 )
            {
                 p.nhap();
                 p.in();
            }
            else if ( luachon == 2 )
            {
                 t.Nhap();
                 t.test();
            }
            else if ( luachon == 3 )
            {
                q.nhap();
                q.kiemtra();
            }
            else if ( luachon == 4 )
            {
                return;
            }
        }

    }
}