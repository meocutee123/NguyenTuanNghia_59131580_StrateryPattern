package app.BaiTap3;

import java.util.*;
public class QLSV {
    ArrayList<SinhVien> ds = new ArrayList<>();


    public void add(SinhVien sv) {
        ds.add(sv);
    }
    
    public void inDs(){
        for(SinhVien sv: ds){
            System.out.println(sv.toString() + "\n");
        }
    }
}