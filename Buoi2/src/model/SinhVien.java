package model;
public class SinhVien {
    private String maSV;
    private String tenSV;
    private float diemSV;
    private String nganhSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, float diemSV, String nganhSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemSV = diemSV;
        this.nganhSV = nganhSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
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
