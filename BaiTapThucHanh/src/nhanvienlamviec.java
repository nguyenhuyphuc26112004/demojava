import java.util.Scanner;

public class nhanvienlamviec {

    String hoTen;
    String GioiTinh;
    String chucVu;
    public int namSinh, tuoi;
    public void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        hoTen = sc.nextLine();
        sc.close();
    }
    public void nhapgioitinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gioi Tinh: ");
        GioiTinh = sc.nextLine();
        sc.close();
    }
    public void nhapchucvu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuc Vu: ");
        chucVu = sc.nextLine();
        sc.close();
    }
    public void nhapnamsinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nam Sinh: ");
        namSinh = sc.nextInt();
        sc.close();
    }
    public void tinhTuoi(){
        tuoi = 2024 - namSinh;
    }
    public void inthongtin(){
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Gioi Tinh: " + GioiTinh);
        System.out.println("Chuc Vu: " + chucVu);
        System.out.println("Tuoi: " + tuoi);
    }
}
