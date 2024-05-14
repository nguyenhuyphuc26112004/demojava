package Nhanvien;

import java.util.Scanner;

public class person {
    public String ten;
    public int Tuoi;
    public String quequan, chucvu;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        ten = sc.nextLine();
        System.out.println("Tuoi: ");
        Tuoi = sc.nextInt();
        
    }
    public void nhapquequan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quan: ");
        quequan = sc.nextLine();
        
    }
    public void nhapchucvu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuc vu: ");
        chucvu = sc.nextLine();
        
    }
    public void hienthi(){
        System.out.println("Ho ten: " +ten);
        System.out.println("Tuoi: " +Tuoi);
        System.out.println("Que quan: " +quequan);
        System.out.println("Chuc vu: " +chucvu);
    }

    public static void main(String[] args) {
        person ps= new person();
        ps.nhapthongtin();
        ps.nhapquequan();
        ps.nhapchucvu();
        ps.hienthi();
    }
}
