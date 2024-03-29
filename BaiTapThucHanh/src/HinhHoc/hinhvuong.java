package HinhHoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
    public hinhvuong(){
        ten = "HInh Vuong";
    }
    public void nhapcanh(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Canh = ");
        dai = rong = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = dai * 4;
    }
    public void tinhdientich(){
        dientich = dai * dai;
    }
    public static void main(String[] args) {
        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();

    }
}
