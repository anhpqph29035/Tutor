package poly.edu.model;
public class SinhVien {
    private String MasV;
    private String hoten;
    private float diemSV;
    private String nganhSv;

    public SinhVien() {
    }

    public SinhVien(String MasV, String hoten, float diemSV, String nganhSv) {
        this.MasV = MasV;
        this.hoten = hoten;
        this.diemSV = diemSV;
        this.nganhSv = nganhSv;
    }

    public String getMasV() {
        return MasV;
    }

    public void setMasV(String MasV) {
        this.MasV = MasV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDiemSV() {
        return diemSV;
    }

    public void setDiemSV(float diemSV) {
        this.diemSV = diemSV;
    }

    public String getNganhSv() {
        return nganhSv;
    }

    public void setNganhSv(String nganhSv) {
        this.nganhSv = nganhSv;
    }
    
    
}
