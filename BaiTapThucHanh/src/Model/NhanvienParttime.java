package Model;

public class NhanvienParttime extends Nhanvien{
    private int giolamviec;
    public NhanvienParttime(String ten, int giolamviec){
        this.ten = ten;
        this.giolamviec = giolamviec;
    }
    @Override
    public String loaiNhanvien(){
        return "Nhan vien thoi vu";
    }
    public void tinhluong(){
        luong = Nhanvien.LUONG_NHAN_VIEN_PARTTIME_MOI_GIO * giolamviec;
        
    }
}
