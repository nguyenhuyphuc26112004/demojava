import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = sc.nextDouble();
        System.out.println("nhap b: ");
        b = sc.nextDouble();
        System.out.println("nhap c:");
        c = sc.nextDouble();
        if(a==0){
            System.out.println("nhap lai a phai khac 0: ");
        }
        else{
            delta =(b*b - 4*a*c) ;
            if(delta>0){
                x1=(-b + Math.sqrt(delta))/2*a;
                x2=(-b - Math.sqrt(delta))/2*a;
                System.out.println("x1=" +x1);
                System.out.println("x2=" +x2);
            }
            else if (delta == 0){
                x1 = -b/(2*a);
                System.out.println("phuong trinh co nghiem kep: x1 = x2 " + x1);
            }
            else{
                System.out.println("phuong trinh vo nghiem");
            }
        }
        sc.close();    
        
    }

        
    }
    


