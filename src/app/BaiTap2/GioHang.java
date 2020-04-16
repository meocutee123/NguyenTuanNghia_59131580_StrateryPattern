package app.BaiTap2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> ds = new ArrayList<>();

    public void sethinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void them(HangHoa hangHoa){
        ds.add(hangHoa);
    }

    public double thanhToan(){
        int tien = 0;
        for(HangHoa hang : ds){
            tien += hang.getGia();
        }
        return hinhThucTT.thanhToan(tien);
    }

    public int tongTien(){
        int tong = 0;
        for (HangHoa hang : ds){
            tong += hang.getGia();
        }
        return tong;
    }

    public void inDS(){
        ds.forEach(ds -> System.out.println(ds.TT()));
    }

}   