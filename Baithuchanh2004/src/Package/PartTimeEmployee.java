package Package;

public class PartTimeEmployee extends Employee {
  public int numberOfDayWork;
  public void addNumberOfDayWork(){
    System.out.println("So ngay da lam viec");
    numberOfDayWork = sc.nextInt();
  }
  public int Salary(){
    return numberOfDayWork*30000;
  }
  public void typeOfEmployee(){
    System.out.println("La nhan vien Part time");
  }
}