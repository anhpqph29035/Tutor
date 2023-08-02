package services;

import java.util.ArrayList;
import poly.edu.model.SinhVien;

public class SinhVienSer {
    private ArrayList<SinhVien> listSV = new ArrayList<>();
    
    public ArrayList<SinhVien> fakeData(){
        listSV.add(new SinhVien("SV1","Dương Văn Nam",9,"PTPM"));
        listSV.add(new SinhVien("SV2","Đinh Thị Nga",6,"TKDH"));
        listSV.add(new SinhVien("SV3","Phạm Hoàng Quân",10,"UDPM"));
        
        return listSV;
    }
    
    public String addSinhVien(SinhVien sv){
        return(sv!=null&&listSV.add(sv)?"Thêm thành công":"Thêm thất bại");
    }
    
    public String updateSinhVien(int Index,SinhVien sv){
        if(sv!=null){
            listSV.set(Index, sv);   
            return "Sửa thành công";
        }else{
             return "Sửa thất bại";
        }
         
    }
    public String xoaSinhVien(int Index){
        return(listSV.remove(Index)!=null?"Xóa thành công":"Xóa thất bại");
    }
}
