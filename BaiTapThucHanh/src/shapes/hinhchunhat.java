package shapes;

import java.util.Scanner;

public class hinhchunhat {
    public float dai;
    public float rong;
    public float chuvi;
    public float dientich;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dai = ");
        dai = sc.nextFloat();
        System.out.println("Rong =");
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
    public void InThongTin(){
        System.out.println("Chu Vi = " + chuvi);
        System.out.println("Dien Tich = " +dientich);
    }
    
}
