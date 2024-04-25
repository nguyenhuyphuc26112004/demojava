package Shape;

import java.util.Scanner;

public class HInhtron {
    public final float PI = 3.14f;
    public float r, chuvi, dientich;
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" R = ");
        r = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * r;
    }
    public void tinhdientich(){
        dientich = PI * r * r;
    }
    public void hienthi(){
        System.out.println(" Chu vi: " +chuvi);
        System.out.println("Dien tich: " +dientich);
    }
    public static void main(String[] args) {
        HInhtron htr = new HInhtron();
        htr.nhapbankinh();
        htr.tinhchuvi();
        htr.tinhdientich();
        htr.hienthi();
    }
}
