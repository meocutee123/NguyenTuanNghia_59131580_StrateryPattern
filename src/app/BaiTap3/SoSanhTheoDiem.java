package app.BaiTap3;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2){
        if(o1.getdiemTB() > o2.getdiemTB()) return 1;
        else if (o1.getdiemTB() < o2.getdiemTB()) return -1;
        else return 0;
    }
}