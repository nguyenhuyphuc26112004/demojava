package HinhHoc;

import java.util.Scanner;

public class hinhtru extends hinhtron{
    
    public hinhtru(){
        ten = "Hinh Tru";
    }
    public float chieucao;
    public void nhapchieucao(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Chieu cao = ");
        chieucao = sc.nextFloat();
        sc.close();
    }
    public void tinhthetich(){
        thetich = PI * r * r * chieucao;
    }
    public static void main(String[] args) {
        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.nhapbankinh();
        
        htru.tinhthetich();
        htru.inthetich();
    }
}
