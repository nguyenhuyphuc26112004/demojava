package NhanVien;

import java.util.Scanner;

public class employee extends Person{
    public float luong;
    public float tglam;
    public void nhaptglam(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhsp thoi gian lam: ");
        tglam = sc.nextFloat();
        sc.close();
    }
    public void inluong(){
        System.out.println("Luong: " +luong);
    }
    public static void main(String[] args) {
        employee em = new employee();
        em.nhapthongtin();
        em.nhaptglam();
        em.hienthi();
        em.inluong();
    }
}
