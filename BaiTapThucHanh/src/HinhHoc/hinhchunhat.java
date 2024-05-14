package HinhHoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai,rong;
    public hinhchunhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        dai = sc.nextFloat();
        System.out.println("Chieu rong: ");
        rong = sc.nextFloat();
        
    }
    public void tinhchuvi(){
        chuvi = (dai + rong) * 2;
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
    public static void main(String[] args) {
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapthongtin();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inthongtin();
    }
}
