package Shape;
import java.util.Scanner;
public class Triangle extends Point {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    public void Nhap()
    {
        System.out.println("Nhap canh a: ");
        a = sc.nextInt();
        System.out.println("Nhap canh b: ");
        b = sc.nextInt();
        System.out.println("Nhap canh c: ");
        c = sc.nextInt();
    }
    public void test()
    {
        if(a+b>c && b+c>a && c+a>b)
        {
            System.out.println("a,b,c la ba canh cua tam giac");
            if( a == b && b == c )
            System.out.println("Day la tam giac deu");
            if( a==b || b == c || c == a)
            System.out.println("Day la tam giac can");
    
        }
        else
            {
                System.out.println("Khong la 3 canh cua tam giac");
            }
        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
               System.out.println("La tam giac vuong"); 
    }
}