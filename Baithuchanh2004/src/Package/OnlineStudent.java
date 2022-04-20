package Package;

public class OnlineStudent extends Student{
  public String TimeOut;
  public void addTimeOut(){
    System.out.println("Gio nghi");
    TimeOut = sc.nextLine();
  }
  public void displayTimeOut(){
    System.out.println("Gio nghi: "+TimeOut);
  }
  public void placeToStudy(){
    System.out.println("Het gio hoc");
  }
}