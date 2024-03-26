package HinhHoc;

import java.util.Scanner;

public class hinhhoc {
    public final float PI = 3.14f;
    public float chuvi,thetich,dientich;
    public String ten;
    public void xuatten(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +ten+ "\n");
        sc.close();
    }
    public void inchuvi(){
        System.out.println("Chu vi " + chuvi);
    }
    public void inDientich(){
        System.out.println("Dien tich " + dientich);
    }
    public void inThetich(){
        System.out.println("The tich " + thetich);
    }
}
