package HinhHoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai,rong;
    public hinhchunhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai =");
        dai = sc.nextFloat();
        sc.close();
    }
    public void nhapchieurong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu rong =");
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = (dai + rong )* 2;
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
