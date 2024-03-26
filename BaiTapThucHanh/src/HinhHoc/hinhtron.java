package HinhHoc;

import java.util.Scanner;

public class hinhtron extends hinhhoc{
    public float r;
    public hinhtron(){
        ten = "Hinh Tron";
    }
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("R = ");
        r = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * r;
    }
    public void tinhdientich(){
        dientich = PI * r * r;
    }
}
