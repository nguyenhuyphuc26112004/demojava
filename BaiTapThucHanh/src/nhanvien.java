import java.util.Scanner;

public class nhanvien {

    String hoTen;
    String GioiTinh;
    String chucVu;
    public int namSinh, tuoi;
    public void nhaphoten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        hoTen = sc.nextLine();
    }
    public void nhapgioitinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gioi Tinh: ");
        GioiTinh = sc.nextLine();
    }
    public void nhapchucvu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuc Vu: ");
        chucVu = sc.nextLine();
    }
    public void nhapnamsinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nam Sinh: ");
        namSinh = sc.nextInt();
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
