package services;

import java.util.ArrayList;
import model.SinhVien;
import java.sql.*;

public class SinhVienServices {

    public ArrayList<SinhVien> getAllSV() {
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql = "Select Masv,hoten,diem,nganh from sinhvien";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while (rs.next()) {
                list.add(new SinhVien(rs.getString(1),
                        rs.getString(2), rs.getFloat(3),
                         rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
