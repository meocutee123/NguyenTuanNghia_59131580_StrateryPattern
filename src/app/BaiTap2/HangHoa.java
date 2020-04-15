package app.BaiTap2;

public class HangHoa extends GioHang {

    String tenHH;
    int gia;
    String moTa;

    public HangHoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    @Override
    public double thanhToan() {
        return 0;
    }

}