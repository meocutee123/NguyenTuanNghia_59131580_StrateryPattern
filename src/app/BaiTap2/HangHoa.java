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

    public String TT() {
        return this.tenHH + " " + this.gia + " " + this.moTa;
	}

	public int getGia(){
        return gia;
    }
}