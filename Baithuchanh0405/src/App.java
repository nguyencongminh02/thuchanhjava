import java.util.ArrayList;
public class App {
    public static  void main(String[] args){
        ArrayList<String> arrListString= new ArrayList<>();
        arrListString.add("M");
        arrListString.add("i");
        arrListString.add("n");
        arrListString.add("h");
        System.out.println ("Co Cac phan tu la");
        for (int i = 0; i <arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\n" );
        }
    }
}