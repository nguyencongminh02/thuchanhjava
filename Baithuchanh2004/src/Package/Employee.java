package Package;

public class Employee extends Person {
  protected String Career;
  public void addCareer(){
    System.out.println("Nganh nghe");
    Career = sc.nextLine();
  }
  public void displayPosition(){
    System.out.println("Career: "+ Career);
  }
}