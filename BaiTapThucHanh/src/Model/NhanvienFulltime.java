package Model;

import Model.util.Configs;

public class NhanvienFulltime extends Nhanvien{
    int ngaylamthem, chucvu;

    public nvfulltime(String ten){
        super(ten);
    this.chucvu = Configs.nv_linh;
    }

    public nvfulltime(String ten , int ngaylamthem){
        super(ten);
    this.ngaylamthem = ngaylamthem;
    this.chucvu = Configs.nv_linh;
    }

    public void loaichucvu(int chucvu) {
        this.chucvu = chucvu;
    }

    public String loainhanvien() {
        if (chucvu == Configs.nv_linh) {
            return " linh fulltime";
        } else {
            return " sep ";
        }

    }

    public void tinhluong() {
        if (chucvu == Configs.nv_linh) {
            luong = configs.luong_nv_fulltime_duc + ngaylamthem * configs.luong_fulltime;
        } else if (chucvu == configs.nv_sep) {
            luong = configs.luong_nv_fulltime_sep + ngaylamthem * configs.luong_fulltime;
        }
    }
}

