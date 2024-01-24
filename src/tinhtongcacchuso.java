import java.util.Scanner;

public class tinhtongcacchuso {
    public static void main(String[] args) {
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong bat ky:");
        n = sc.nextInt();
        while(n>0){
            s = s + n % 10;
            n/=10;
        }
        System.out.println("tong la :" + s);
    }
}
