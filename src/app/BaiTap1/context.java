package app.BaiTap1;

public class context{
    private Tinh tinhtoan;
    public void setTinhtoan(Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    public float tinh(float a, float b){
        return tinhtoan.tinh(a, b);
    }
}