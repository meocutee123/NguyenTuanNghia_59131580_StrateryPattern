package app.BaiTap3;

import java.sql.Date;
public abstract class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public SinhVien(){

    }
    public SinhVien(String hoTen, Date ngaySinh, float diemTB){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public float getdiemTB(){
        return diemTB;
    }
    public void setdiemTB(float diemTB){
        this.diemTB = diemTB;
    }
    
    public Date getngaySinh(){
        return ngaySinh;
    }
    public void setngaySinh(Date ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString(){
        return this.hoTen + " " + this.ngaySinh + " " + this.diemTB;
    }
}
