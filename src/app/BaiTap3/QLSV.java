package app.BaiTap3;

import java.util.ArrayList;

public class QLSV implements ISoSanh<SinhVien> {
    ArrayList<SinhVien> ds = new ArrayList<>();

    public QLSV(ArrayList<SinhVien> ds){
        this.ds = ds;
    }
    public void sapXep(){

    }
    @Override
    public void add(SinhVien o){
        ds.add(o);
    }
    @Override
    public void inDs(){
        for(SinhVien sv: ds){
            System.out.println(sv.toString() + "\n");
        }
    }   
}