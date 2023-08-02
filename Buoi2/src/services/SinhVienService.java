package services;

import java.util.ArrayList;
import model.SinhVien;
import java.sql.*;
public class SinhVienService {
    public ArrayList<SinhVien> getSinhVien(){
        ArrayList<SinhVien> listSV = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while(rs.next()){
                listSV.add(new SinhVien(rs.getString(1),rs.getString(2)
                        ,rs.getFloat(3),rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }
}
