package HinhHoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
    public hinhvuong(){
        ten = "Hinh vuong ";
    }
    public void nhapcanh(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap canh");
        dai = rong = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = dai * 4;
    }
    public void tinhdientich(){
        dientich = dai * dai;
    }
}
