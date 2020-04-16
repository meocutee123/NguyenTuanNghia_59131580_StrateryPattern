package app.BaiTap2;
public class MyMainClass {
    public static void main(String[] args) {
        HangHoa hh = new HangHoa("Macbook Pro 2019", 20000000, "Game of the year!");
        HangHoa hh2 = new HangHoa("Macbook Pro 2020", 21000000, "Artist of the decade!");

        GioHang gh = new GioHang();
        gh.sethinhThucTT(new ThanhToanCOD());
        gh.them(hh);
        gh.them(hh2);

        gh.inDS();
        System.out.println("Tong tien: " + gh.tongTien());
        System.out.println("Tien phai tra: " + gh.thanhToan() + "\n");

        GioHang gh2 = new GioHang();
        gh2.sethinhThucTT(new ThanhToanOnline());
        gh2.them(hh2);

        gh2.inDS();
        System.out.println("Tong tien: " + gh2.tongTien());
        System.out.println("Tien phai tra: " + gh2.thanhToan());

    }
}