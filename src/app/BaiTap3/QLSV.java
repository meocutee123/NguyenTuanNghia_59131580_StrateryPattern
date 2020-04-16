package app.BaiTap3;

import java.util.ArrayList;

public class QLSV {
    ArrayList<SinhVien> ds = new ArrayList<>();

    public void sapXep(){
        
    }
    public void add(SinhVien o){
        ds.add(o);
    }
    public void inDs(){
        for(SinhVien sv: ds){
            System.out.println(sv.toString() + "\n");
        }
    }
}