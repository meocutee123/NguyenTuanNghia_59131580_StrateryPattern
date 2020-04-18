package app.BaiTap3;

import java.util.*;
public class QLSV {
    ISoSanh<SinhVien> SS;

    ArrayList<SinhVien> ds = new ArrayList<>();
    public void add(SinhVien sv) {
        ds.add(sv);
    }

    public void setSS(ISoSanh<SinhVien> SS){
        this.SS = SS;
    }
    public void sapXep(){
        Collections.sort(ds, SS::soSanh);
    }
    
    public void inDs(){
        for(SinhVien sv: ds){
            System.out.println(sv.toString() + "\n");
        }
    }
}