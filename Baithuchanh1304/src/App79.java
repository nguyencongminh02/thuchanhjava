import Model.NhanVienFullTime;

import Model.NhanVienPartTime;

import Model.Configs;
public class App79 {
  public static void main(String[] args){
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van B"); 
        NhanVienFullTime linh2 = new NhanVienFullTime("Nguyen Van C", 3); 
        NhanVienPartTime thoiVu = new NhanVienPartTime("Nguyen Van D", 240); 
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
  }
}