package Package;

public class TaxiCar implements Car {
  public void Move(){
    System.out.println("Taxi dang den diem hen");
  }
  public void Stop(){
    System.out.println("Taxi khong di chuyen");
  }
  public void TurnRight(){
    System.out.println("Taxi re phai");
  }
  public void TurnLeft(){
    System.out.println("Taxi re trai");
  }
  public void Reverse(){
    System.out.println("Taxi dang quay lai");
  }
}