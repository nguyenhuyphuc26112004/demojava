package Nhanvien;

import java.util.Scanner;

public class employee extends person{
    public float luong, tglam;
    public void nhaptglam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tg lam: ");
        tglam = sc.nextFloat();
       
    }
    public void inluong(){
        System.out.println("Luong = " +luong);
    }
    public static void main(String[] args) {
        employee em = new employee();
        em.nhapthongtin();
        em.nhapquequan();
        em.nhapchucvu();
        em.hienthi();
        
    }
}
