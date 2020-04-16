package app.BaiTap3;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(T o1, T o2){
        if(o1 > o2) return 1;
        else if (o1 < o2) return -1;
        else return 0;
    }
}