package app.BaiTap3;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class MyMainClass {
    public static void main(String[] args) {
        QLSV ql = new QLSV();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
       // Date date = format.parse("1999-28-05");
        LocalDate ld = LocalDate.of( 2026 , 1 , 23 );
        System.out.println(ld);
        //SinhVien sv = new SinhVien("Nguyen Tuan Nghia", format.parse("2009-12-31"), 10.0f);
    }
}