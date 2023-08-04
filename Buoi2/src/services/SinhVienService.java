package services;

import java.util.ArrayList;
import model.SinhVien;
import java.sql.*;

public class SinhVienService {

    public ArrayList<SinhVien> getSinhVien() {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN";
        ResultSet rs = JDBCHelper.excuteQuery(sql);
        try {
            while (rs.next()) {
                listSV.add(new SinhVien(rs.getString(1), rs.getString(2),
                        rs.getFloat(3), rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }

    public Integer deleteSV(String ma) {
        int row;
        String sql = "DELETE FROM SINHVIEN WHERE MASV = ?";
        row = JDBCHelper.excuteUpdate(sql, ma);
        return row;
    }

    public Integer addSV(SinhVien sv) {
        int row;
        String sql = "insert into SinhVien(MaSV,HoTen,Diem,nganh)\n"
                + "values (?,?,?,?)";
        row = JDBCHelper.excuteUpdate(sql, sv.getMaSV(),
                sv.getTenSV(), sv.getDiemSV(), sv.getNganhSV());
        return row;
    }

    public Integer updateSV(SinhVien sv) {
        int row;
        String sql = "UPDATE SINHVIEN SET HOTEN = ?,Diem = ?,NGANH = ? WHERE MASV = ?";
        row = JDBCHelper.excuteUpdate(sql, sv.getTenSV(),
                sv.getDiemSV(), sv.getNganhSV(), sv.getMaSV());
        return row;
    }
}
