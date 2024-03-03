import java.util.Scanner;

public class QuanLyHocSinh {
    String hoTen;
    String MSV;
    String Namsinh;
    String GioiTinh;
    public void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ho ten: ");
        hoTen = sc.nextLine();
    }
    public void nhapMSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MSV: ");
        MSV = sc.nextLine();
    }
    public void nhapGioiTinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gioi tinh: ");
        GioiTinh = sc.nextLine();
    }
    void inThongTin(){
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("MSV: " + MSV);
        System.out.println("Gioi Tinh: " + GioiTinh);
    }

}
