import storage.SinhVien;
public class App72 {
  public static void main(String[] args){
    SinhVien sinhVien1 = new SinhVien();
    SinhVien sinhVien2 = new SinhVien();
    sinhVien1.setTen("");
    sinhVien1.setTuoi(23);
    sinhVien2.setTen("Cong Minh");
    sinhVien2.setTuoi(17);
    System.out.println("Sinh vien 1 co ten : " + sinhVien1.getTen() + ", tuoi: " + sinhVien1.getTuoi());
    System.out.println("Sinh vien 2 co ten : " + sinhVien2.getTen() + ", tuoi: " + sinhVien2.getTuoi());
  }
}