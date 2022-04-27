package Shape;
public class Quadrilateral extends Point {
    Point p = new Point();
    public void kiemtra(){
        if(p.hoanhdo < 0 || p.tungdo < 0 )
       {
           p.hoanhdo = Math.abs(p.hoanhdo);
           p.tungdo = Math.abs(p.tungdo);
       }
       if(p.hoanhdo == p.tungdo && p.hoanhdo + p.tungdo == 180 )
       {
           System.out.println("\nLa mot tu giac va la tu giac noi tiep");
       }
       else 
       {
           System.out.println("\nKhong la tu giac ");
       }
    }
}