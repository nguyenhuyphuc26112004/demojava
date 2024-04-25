package NhanVien;

import java.util.Scanner;

public class employeeParttime extends employee{
    public float Thoigianlamviec;
    public float Tienluong1gio;
    public void nhapthongtinlamviec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thoi Gian LAm Viec: ");
        Thoigianlamviec = sc.nextFloat();
        System.out.println("Tien Luong 1 gio: ");
        Tienluong1gio = sc.nextFloat();
        sc.close();
    }
    public void tinhluong(){
        luong = Thoigianlamviec * Tienluong1gio;
    }
    public static void main(String[] args) {
        employeeParttime emP = new employeeParttime();
        emP.nhapthongtin();
        emP.nhapthongtinlamviec();
        emP.hienthi();
        emP.tinhluong();
        emP.inluong();
    }
}
