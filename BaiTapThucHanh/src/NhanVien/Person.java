package NhanVien;

import java.util.Scanner;

public class Person {
    public String HoTen;
    public int tuoi;
    public String quequan;
    public String chucvu;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Chuc vu: ");
        chucvu = sc.nextLine();
        System.out.println("Que quan: ");
        quequan = sc.nextLine();
        sc.close();
    }
    public void hienthi(){
        System.out.println("Ho Ten: " +HoTen);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Que quan: "+quequan);
        System.out.println("Chuc vu: " +chucvu);
    }
    public Person(){
        HoTen = "nguyen van a";
        tuoi = 20;
        quequan = "hn";
        chucvu = "h";
    }
    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapthongtin();
        ps.hienthi();
    }
}
