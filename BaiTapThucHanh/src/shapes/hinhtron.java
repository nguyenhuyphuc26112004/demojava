package shapes;

import java.util.Scanner;

public class hinhtron {
    public final float PI = 3.14f;
    public float r;
    public float chuvi;
    public float dientich;

    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("R = ");
        r = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * r;
    }
    public void tinhdientich(){
        dientich = PI * r * r;
    }
    public void InThongTin(){
        System.out.println("Chu Vi: " + chuvi);
        System.out.println("Dien Tich: " + dientich);
    }
    
}
