import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main(String[] args){
        String name;
    HashSet<String> hashSetString = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
        hashSetString.add("a");
        hashSetString.add("b"); 
        hashSetString.add("c");
        hashSetString.add("d");
        hashSetString.add("e");
        hashSetString.add("f");
    System.out.println("Cac phan tu co trong HashSetInteger");
    System.out.println(hashSetString);
    System.out.println("Nhap phan tu can xoa");
        name = scanner.nextLine();
    if (hashSetString.contains(name)){
        hashSetString.remove(name);
        System.out.println("Xoa thanh cong");
        System.out.println("Cac phan tu con lai trong hashSetInteger sau khi them");
        System.out.println(hashSetString);
    }
    else {
        System.out.println("Xoa khong thanh cong");
    }
}
}