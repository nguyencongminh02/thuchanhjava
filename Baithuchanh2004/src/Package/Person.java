package Package;
import java.util.Scanner;
public class Person{
  protected String name;
  protected int age;
  Scanner sc = new Scanner(System.in);
  public void addName(){
    System.out.println("Nhap ho va ten");
    name = sc.nextLine();
  }
  public void displayName(){
    System.out.println("Ho va ten: "+name);
  }
}