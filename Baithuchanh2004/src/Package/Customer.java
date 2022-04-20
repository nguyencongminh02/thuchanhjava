package Package;

public class Customer extends Person {
  protected String customerID;
  public void addCustomerID(){
    System.out.println("ID khach hang");
    customerID = sc.nextLine();
  }
  public void displayCustomerID(){
    System.out.println("ID khach hang: "+customerID);
  }
  
}