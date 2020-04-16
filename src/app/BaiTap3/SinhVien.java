package app.BaiTap3;

import java.sql.Date;
import java.text.SimpleDateFormat;
public class SinhVien {
    String hoTen;
    java.util.Date ngaySinh;
    float diemTB;

    public SinhVien(){

    }
    public SinhVien(String hoTen, java.util.Date dt_1, float diemTB){
        this.hoTen = hoTen;
        this.ngaySinh = dt_1;
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
    
    public java.util.Date getngaySinh() {
        return ngaySinh;
    }
    public void setngaySinh(Date ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString(){
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");

        return this.hoTen + " " + objSDF.format(this.ngaySinh) + " " + this.diemTB;
    }
}
