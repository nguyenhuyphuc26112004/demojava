import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        double a,b,x1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a  = sc.nextDouble();
        System.out.println("nhap b: ");
        b = sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem ");
            }
            else{
                System.out.println("phuong trinh vo ngiem ");
            }
        }
        else{
            x1 = -b/a;
            System.out.println("phuong trinh co nghiem la: " + x1 );
        }


    }
    
}
