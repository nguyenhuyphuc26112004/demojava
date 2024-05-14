package HinhHoc;

import java.util.Scanner;

public class hinhtru extends hinhtron{
    public float chieucao;
    public hinhtru(){
        ten = "Hinh Tru";
    }
    public void nhapchieucao(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Chieu cao: ");
        chieucao = sc.nextFloat();
        
    }
    public void tinhthetich(){
        thetich = PI * r *r * chieucao;
    }
    public static void main(String[] args) {
        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapbankinh();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthongtin();
    }
}
