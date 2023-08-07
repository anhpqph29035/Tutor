package model;
public class SinhVien {
    private String Ma;
    private String HoTen;
    private float Diem;
    private String Nghanh;

    public SinhVien() {
    }

    public SinhVien(String Ma, String HoTen, float Diem, String Nghanh) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        this.Diem = Diem;
        this.Nghanh = Nghanh;
    }

    

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }


    public String getNghanh() {
        return Nghanh;
    }

    public void setNghanh(String Nghanh) {
        this.Nghanh = Nghanh;
    }
    
    
}
