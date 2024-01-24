import java.util.Scanner;

public class tinhtongcacsonguyen {
    public static void main(String[] args) {
        int number,sum=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("nhap vao so nguyen bat ky:");
            number = scanner.nextInt();
            sum+=number;
        }while(sum<100);
        System.out.println("tong cac chu so la: " + sum);
    }
}
