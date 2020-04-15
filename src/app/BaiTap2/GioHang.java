package app.BaiTap2;
import java.util.ArrayList;
public abstract class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> hh = new ArrayList<>();
    public ArrayList<HangHoa> getDs(){
        return hh;
    }


    public void sethinhThucTT(final IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public abstract double thanhToan();
}