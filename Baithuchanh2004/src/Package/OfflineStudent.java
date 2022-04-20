package Package;

public class OfflineStudent extends Student{
  public String ClassTime;
  public void addClassTime(){
    System.out.println("Gio vao lop hoc");
    ClassTime = sc.nextLine();
  } 
  public void displayClassTime(){
    System.out.println("Gio vao lop: " + ClassTime);
  } 
  public void placeToStudy(){
    System.out.println("Sinh vien co mat tai lop hoc");
  }
}