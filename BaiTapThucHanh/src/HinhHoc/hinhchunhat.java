package HinhHoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai,rong;
    public hinhchunhat(){
        ten = "HInh Chu Nhat";
    }
    public void nhapchieudaichieurong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu Dai = ");
        dai = sc.nextFloat();
        System.out.println("Chieu rong = ");
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
    public static void main(String[] args) {
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudaichieurong();
        
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
    }
}
