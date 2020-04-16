package app.BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyMainClass {
    public static void main(String[] args) throws ParseException {
        QLSV ql = new QLSV();
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date dt_1 = objSDF.parse("20-08-1999");
        SinhVien sv1 = new SinhVien("Nguyen Tuan Nghia", dt_1, 10f);
        Date dt_2 = objSDF.parse("20-08-2000");
        SinhVien sv2 = new SinhVien("Nguyen Tuan Meo", dt_2, 9f);
        Date dt_3 = objSDF.parse("20-08-2001");
        SinhVien sv3 = new SinhVien("Nguyen Tuan Cutee", dt_3, 9f);


        ql.add(sv1);
        ql.add(sv2);
        ql.add(sv3);
        ql.inDs();
    }
}