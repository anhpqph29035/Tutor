package services;

import java.sql.*;
import java.util.ArrayList;
import models.SinhVien;

public class SinhVienServices {

    //Phương thức lấy đối tượng từ Database add vào List
    public ArrayList<SinhVien> getAllSV() {
        String sql = "SELECT MASV,HOTEN,DIEM,NGANH FROM SINHVIEN";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            ArrayList<SinhVien> listSV = new ArrayList<>();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setDiemSV(rs.getFloat(3));
                sv.setNganhSV(rs.getString(4));
                listSV.add(sv);
            }
            return listSV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getNganh() {
        String sql = "SELECT DISTINCT NGANH FROM SINHVIEN";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            ArrayList<String> listNganh = new ArrayList<>();
            while (rs.next()) {
                listNganh.add(rs.getString(1));
            }
            return listNganh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean deleteSV(String ma) {
        String sql = "DELETE FROM SINHVIEN WHERE MASV = ?";
        int check = 0;
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public Boolean themSV(SinhVien sv) {
        String sql = "INSERT INTO SINHVIEN (MaSV,Hoten,Diem,Nganh) VALUES(NEWID(),?,?,?)";
        int check = 0;
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, sv.getHoTen());
            ps.setObject(2, sv.getDiemSV());
            ps.setObject(3, sv.getNganhSV());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public Boolean suaSV(SinhVien sv,String ma) {
        String sql = "UPDATE SINHVIEN SET HOTEN=?,DIEM = ?,"
                + "NGANH = ? WHERE MaSV = ?";
        int check = 0;
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, sv.getHoTen());
            ps.setObject(2, sv.getDiemSV());
            ps.setObject(3, sv.getNganhSV());
            ps.setObject(4, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
