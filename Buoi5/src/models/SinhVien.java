package models;
public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemSV;
    private String nganhSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, float diemSV, String nganhSV) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemSV = diemSV;
        this.nganhSV = nganhSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemSV() {
        return diemSV;
    }

    public void setDiemSV(float diemSV) {
        this.diemSV = diemSV;
    }

    public String getNganhSV() {
        return nganhSV;
    }

    public void setNganhSV(String nganhSV) {
        this.nganhSV = nganhSV;
    }
    
    
}
