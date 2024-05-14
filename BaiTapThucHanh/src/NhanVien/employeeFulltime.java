package Nhanvien;

import java.util.Scanner;

public class employeeFulltime extends employee{
    public float LuongCoBan;
    public float TienTangca;
    public float Thoigiamlamthem;
    public void nhapthongtinfulltime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Luong Co Ban: ");
        LuongCoBan = sc.nextFloat();
        System.out.println("Tien tang ca: ");
        TienTangca = sc.nextFloat();
        System.out.println("Thoi Gian LAm them: ");
        Thoigiamlamthem = sc.nextFloat();
        
    }
    public void tinhluong(){
        luong = LuongCoBan + Thoigiamlamthem * TienTangca;
    }
    public static void main(String[] args) {
        employeeFulltime emF = new employeeFulltime();
        emF.nhapthongtin();
        emF.nhapthongtinfulltime();
        emF.tinhluong();
        emF.hienthi();
        emF.inluong();
    }
}

