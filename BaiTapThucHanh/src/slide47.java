import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int number,sum=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("nhap vao so nguyen bat ky:");
            number = scanner.nextInt();
            sum+=number;
        }while(sum<100);
        System.out.println("tong cac so nguyuen vua nhap: " + sum);
        scanner.close();
    }
}
