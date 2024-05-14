package Shape;

import java.util.Scanner;

public class HInhchunhat {
    public float dai,rong,chuvi,dientich;
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
    public void Inthongtin(){
        System.out.println("Chu vi: " +chuvi);
        System.out.println("Dien tich: " +dientich);
    }
    
    public static void main(String[] args) {
        HInhchunhat hcn = new HInhchunhat();
        hcn.nhapthongtin();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.Inthongtin();
    }
    
}
