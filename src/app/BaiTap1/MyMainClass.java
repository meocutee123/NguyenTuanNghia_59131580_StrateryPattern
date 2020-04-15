package app.BaiTap1;

public class MyMainClass {
    public static void main(String[] args){
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        context ct = new context();
        ct.setTinhtoan(cong);
        float x = ct.tinh(75,12);
        ct.setTinhtoan(tru);
        float y = ct.tinh(54,78);
        System.out.println("Ket qua: " + x);
        System.out.println("Ket qua: " + y);
    }
}