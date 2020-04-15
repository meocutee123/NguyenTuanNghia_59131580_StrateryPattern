package app.BaiTap1;

public class MyMainClass {
    public static void main(String[] args){
        context ct = new context(new Cong());
        System.out.println("75 + 12 = " + ct.tinh(75, 12));
        context ct2 = new context(new Tru());
        System.out.println("54 - 78 = " + ct2.tinh(54, 78));
    }
}