package Package;

public class FullTimeEmployee extends Employee {
  public int overtimeHours;
  public static int wage = 5000000;
  public void addOvertimeHours(){
    System.out.println("So gio lam them");
    overtimeHours = sc.nextInt();
  }
  public int Salary(){
    return overtimeHours*20000 + wage;
  }
  public void typeOfEmployee(){
    System.out.println("La nhan vien Full time");
  }
}